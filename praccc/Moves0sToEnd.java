package praccc;

import java.util.Arrays;

public class Moves0sToEnd {
    public static void main(String[] args) {

        int arr[]={1,0,3,0,5};

        move0ToEnd(arr);

        for (int nums:arr){
            System.out.print(nums+" ");
        }

    }

    private static void move0ToEnd(int[] arr) {

        int slow=0;
        for (int fast=0;fast<arr.length;fast++){

            if(arr[fast]!=0){
                arr[slow]=arr[fast];
                slow++;
            }


        }
        while (slow<arr.length){
            arr[slow]=0;
            slow++;
        }

    }
}
