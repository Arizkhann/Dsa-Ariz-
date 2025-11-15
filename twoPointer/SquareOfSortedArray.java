package twoPointer;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {


        int arr[]={-4,-1,0,2,5};//0,1,4,16,25


        int sqarArr[]=sqareOfarr(arr);

        System.out.println(Arrays.toString(sqarArr));


    }

    private static int[] sqareOfarr(int[] arr) {

        int i=0;
        int j=arr.length-1;

        int newArr[]=new int[arr.length];

        int z=arr.length-1;

        while (i<j){

            if(Math.abs(arr[i])>Math.abs(arr[j])){
                newArr[z--]=arr[i]*arr[i];
                i++;
            }else{
                newArr[z--]=arr[j]*arr[j];
                j--;
            }



        }

        return newArr;

    }
}
