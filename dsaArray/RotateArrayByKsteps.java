package dsaArray;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKsteps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("how much u wanna rotate");
        int k=sc.nextInt();

        int arr[]={1,2,3,4,5,6,7,8};

        rotateArr(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArr(int arr[],int k){

        int n=arr.length;
        k=k%n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);






    }


    public static void reverse(int arr[],int start, int end){

        while (start<end){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }


    }




}
