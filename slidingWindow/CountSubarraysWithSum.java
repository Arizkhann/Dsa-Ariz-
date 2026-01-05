package slidingWindow;

public class CountSubarraysWithSum {

    public static int countSubarrays(int[] arr, int k, int targetSum) {

        if (arr.length < k) {
            return 0;
        }

        int windowSum = 0;
        int count = 0;

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if (windowSum == targetSum) {
            count++;
        }

        // Step 2: Slide window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];

            if (windowSum == targetSum) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2};
        int k = 2;
        int S = 3;

        System.out.println("Count of subarrays: "
                + countSubarrays(arr, k, S));
    }
}
