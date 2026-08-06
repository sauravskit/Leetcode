class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum =0 ;
        double max=-Double.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            windowsum+=nums[i];

            if(i>=k-1){
                max=Math.max(windowsum,max);
                windowsum-=nums[i-k+1];
            }
        }
            return max/k;
    }
}
