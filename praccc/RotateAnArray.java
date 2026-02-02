package praccc;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        rotate(arr,2);
        System.out.println(Arrays.toString(arr));


    }


    public static void rotate(int arr[],int k){

        int n=arr.length;
        k=k%n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        //basically 1st we reverse the full array , then we reverse the first k elements , then we reverse the left elemnts from k to end



    }


   public static void reverse(int arr[],int start , int end){

        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }


   }


}
