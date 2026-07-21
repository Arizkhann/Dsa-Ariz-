package recursionPractice;

public class MinElementInArr {
    public static void main(String[] args) {

        int arr[]={6,2,3,4,12,5,9};

        System.out.println(minEle(arr,0,Integer.MAX_VALUE));




    }

    static int  minEle(int arr[],int index,int min){

        if(index>=arr.length){
            return min;
        }

        if(arr[index]<min){
            min=arr[index];
        }

        return   minEle(arr,index+1,min);


    }

}
