package twoPointer;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};


        int result[]=mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        int res[] = new int[arr1.length + arr2.length];
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;

            } else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }
            while (i<arr1.length){
                res[k]=arr1[i];

                k++;
                i++;

            }

            while (j<arr2.length){
                res[k]=arr2[j];

                k++;
                j++;


            }


        return res;
        }



    }
