package recursionPractice;

public class MaxElementInArr {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,12,5,9};

        System.out.println(maxEle(arr,0,Integer.MIN_VALUE));




    }

    static int  maxEle(int arr[],int index,int max){

        if(index>=arr.length){
            return max;
        }

        if(arr[index]>max){
            max=arr[index];
        }

        return   maxEle(arr,index+1,max);


    }


}
