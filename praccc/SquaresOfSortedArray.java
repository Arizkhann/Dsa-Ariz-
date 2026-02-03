package praccc;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {


        int arr[]={-4,-1,0,2,5};
        int newArray[]=squaresOfSorted(arr);

        System.out.println(Arrays.toString(newArray));

    }

    public static int[] squaresOfSorted(int arr[]){


        int newArr[]=new int[arr.length];
        int j=arr.length-1;
        int start=0;
        int end=arr.length-1;


        while (start<=end){

            if(Math.abs(arr[start])>Math.abs(arr[end])){
                newArr[j--]=arr[start]*arr[start];

                start++;
            }else{
                newArr[j--]=arr[end]*arr[end];

                end--;
            }



        }







        return newArr;
    }


}
