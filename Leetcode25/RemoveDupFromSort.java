package Leetcode25;

public class RemoveDupFromSort {
    public static void main(String[] args) {

        int arr[]={1,1,2,2,3,4,4,5};
        System.out.println(remDup(arr));


    }


    static int remDup(int arr[]){

        int slow=0;
        for(int fast=0;fast<arr.length;fast++){

            if(arr[fast]!=arr[slow]){

                slow++;
                arr[slow]=arr[fast];


            }




        }
        return slow+1;




    }


}
