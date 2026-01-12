package slidingWindow;

public class MaxSumSubarray {
    public static void main(String[] args) {

        int arr[] = {9, 1, -2, 3, 4, 7};
        int k = 3;

        System.out.println(maxSumSubArr(arr, k));

    }


    public static int maxSumSubArr(int arr[], int k) {

        int wSum = 0;
        int mSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            wSum += arr[i];
        }
        mSum=wSum;

        //Sliding loop

        for (int i = k; i < arr.length; i++) {

            wSum = wSum + arr[i] - arr[i - k];

            mSum = Math.max(wSum, mSum);
        }


        return mSum;
    }


}
