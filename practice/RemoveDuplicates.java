package practice;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,4,4,5,6};

        int len = remDup(arr);

        System.out.println(Arrays.toString(Arrays.copyOf(arr, len)));
    }

    public static int remDup(int arr[]) {

        int fast = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[fast] != arr[i]) {
                fast++;
                arr[fast] = arr[i];
            }
        }

        return fast + 1; // length of unique array
    }
}
