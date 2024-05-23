class Solution {
    public int findDuplicate(int[] nums) {
        // Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];
        
        // Phase 1: Find the intersection point of the two pointers
        do {
            slow = nums[slow];          // Move slow pointer by one step
            fast = nums[nums[fast]];    // Move fast pointer by two steps
        } while (slow != fast);         // Continue until they meet
        
        // Phase 2: Find the entrance to the cycle
        // Reset slow pointer to start and move both pointers at the same speed
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        // Both pointers are now at the entrance of the cycle
        return slow;
    }
}
