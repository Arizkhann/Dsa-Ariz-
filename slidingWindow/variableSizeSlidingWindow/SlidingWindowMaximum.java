package slidingWindow.variableSizeSlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        maxSlidingWindow(arr, k);
    }

    public static void maxSlidingWindow(int[] arr, int k) {

        Deque<Integer> dq = new LinkedList<>();
        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            // 1️⃣ Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[right]) {
                dq.pollLast();
            }

            // 2️⃣ Add current index to deque
            dq.addLast(right);

            // 3️⃣ Remove elements out of window
            if (dq.peekFirst() < right - k + 1) {
                dq.pollFirst();
            }

            // 4️⃣ When window size becomes k → print max
            if (right >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
}
