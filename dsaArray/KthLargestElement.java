package dsaArray;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class KthLargestElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;

        System.out.println("Using Sorting: " + kthLargestSorting(arr.clone(), k));
        System.out.println("Using Min-Heap: " + kthLargestHeap(arr.clone(), k));
        System.out.println("Using QuickSelect: " + kthLargestQuickSelect(arr.clone(), k));
    }

    // ✅ 1. Sorting Approach (O(n log n))
    public static int kthLargestSorting(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    // ✅ 2. Min-Heap Approach (O(n log k))
    public static int kthLargestHeap(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    // ✅ 3. QuickSelect Approach (O(n) avg, O(n^2) worst)
    public static int kthLargestQuickSelect(int[] arr, int k) {
        int n = arr.length;
        return quickSelect(arr, 0, n - 1, n - k);
    }

    private static int quickSelect(int[] arr, int left, int right, int kSmallest) {
        if (left == right) {
            return arr[left];
        }

        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);

        pivotIndex = partition(arr, left, right, pivotIndex);

        if (kSmallest == pivotIndex) {
            return arr[kSmallest];
        } else if (kSmallest < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, kSmallest);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, kSmallest);
        }
    }

    private static int partition(int[] arr, int left, int right, int pivotIndex) {
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }

        swap(arr, right, storeIndex);
        return storeIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
