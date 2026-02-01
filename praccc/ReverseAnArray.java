package praccc;

public class ReverseAnArray {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};

        reverseArr(arr);


    }


    public static int[] reverseArr(int arr[]){

        int start=0;
        int end=arr.length-1;

        while (start<end){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;


        }

        for(int nums:arr){
            System.out.print(nums+" ");
        }



        return arr;
    }

}
