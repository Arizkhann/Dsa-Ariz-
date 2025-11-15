package twoPointer;

/*
Title: Two Sum II – Input Array Is Sorted

Description:
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Return the indices of the two numbers (as an integer array [index1, index2]) where 1 <= index1 < index2 <= numbers.length.

The solution must use only constant extra space.
*/



public class TwoSum2 {
    public static void main(String[] args) {

        int arr[]={2,7,11,15};
        int target=9;
        twoNosum(arr,target);

    }



    public static void twoNosum(int arr[],int target){


        int start=0;int end=arr.length-1;

        while (start<end){

            int sum=arr[start]+arr[end];


            if(sum==target){
                System.out.println(arr[start]+" "+arr[end]);// here we can print start+1 && end+1
                return;
            }
            else if(sum<target){
                start++;
            }else {
                end--;
            }

        }


        System.out.println("no pair found");



    }


}
// answer must be [1,2]