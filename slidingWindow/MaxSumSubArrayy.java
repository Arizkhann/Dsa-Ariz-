package slidingWindow;

public class MaxSumSubArrayy {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Maximum sum of subarray of size " + k + " is: "
                + maxSumSubarray(arr, k));
    }






    public static int maxSumSubarray(int[] arr, int k) {
        // Edge case
        if (arr.length < k) {
            throw new IllegalArgumentException("Window size k is greater than array length");
        }

        int windowSum = 0;
        int maxSum = 0;

        // Step 1: Calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }



}
