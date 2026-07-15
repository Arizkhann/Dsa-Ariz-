package recursion;

public class MinElement {
    public static void main(String[] args) {
        int arr[]={4,2,1,5,9};
        int min=Integer.MAX_VALUE;
        minele(arr,0,min);

    }

    static void minele(int arr[],int n,int min){

        if(n>=arr.length){
            System.out.println(min);
            return;
        }

        if(arr[n]<min){
            min=arr[n];
        }

        minele(arr,n+1,min);





    }


}
