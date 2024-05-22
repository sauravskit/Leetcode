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