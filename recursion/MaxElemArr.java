package recursion;

public class MaxElemArr {
    public static void main(String[] args) {


        int arr[]={4,2,1,5,9};
        int max=Integer.MIN_VALUE;
        maxELe(arr,0,max);


    }

    static void maxELe(int arr[],int n,int max){


        if(n>=arr.length){
            System.out.println(max);
            return ;
        }


        if(arr[n]>max){
            max=arr[n];
        }

        maxELe(arr,n+1,max);



    }


}
