package slidingWindow.variableSizeSlidingWindow;

public class SmallestSubarraySumAtLeastX {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 2, 3, 2};
        int x=7;
        System.out.println(method(arr,x));
    }

    public static int method(int arr[],int x){


        int left=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;


        for(int right=0;right<arr.length;right++){

            sum+=arr[right];

            while (sum>=x){

                minLength=Math.min(minLength,right-left+1);


                sum=sum-arr[left];
                left++;



            }




        }


        return minLength == Integer.MAX_VALUE ? 0 : minLength;


    }


}
