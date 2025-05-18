class Solution {
    public int findKthLargest(int[] nums, int k) {

        int kthlargestelement = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            pq.add(i);
        }
        while (k>0) {
            kthlargestelement=pq.poll();
            k--;
        }
        return kthlargestelement;
    }
}


-----------------------------------optimise solution  - ------------------
import java.util.PriorityQueue;
import java.util.Collections;

public class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        int n = r + 1;
        int ans = -1;

        if (k <= n / 2) {
            // Use min-heap
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                minHeap.offer(arr[i]);
            }
            for (int j = 0; j < k - 1; j++) {
                minHeap.poll();
            }
            ans = minHeap.peek();
        } else {
            // Use max-heap
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                maxHeap.offer(arr[i]);
            }
            for (int j = 0; j < n - k; j++) {
                maxHeap.poll();
            }
            ans = maxHeap.peek();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 3;
        System.out.println("Kth smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
    }
}
