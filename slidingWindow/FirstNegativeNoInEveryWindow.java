package slidingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNoInEveryWindow {

    public static void main(String[] args) {

        int arr[] = {1, -1, 2, 3, -4, -5, -2, 1};
        int k = 3;

        firstNegative(arr, k);
    }

    private static void firstNegative(int arr[], int k) {

        Queue<Integer> queue = new LinkedList<>();
        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            // 1️⃣ Add negative numbers to queue
            if (arr[right] < 0) {
                queue.add(arr[right]);
            }

            // 2️⃣ When window size becomes k, here sliding  happens
            if (right - left + 1 == k) {

                // Print answer for current window
                if (queue.isEmpty()) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(queue.peek() + " ");
                }

                // 3️⃣ Remove outgoing element if needed
                if (!queue.isEmpty() && arr[left] == queue.peek()) {
                    queue.poll();
                }

                // 4️⃣ Slide the window
                left++;
            }
        }
    }
}
