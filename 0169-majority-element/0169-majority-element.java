class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        int n =(nums.length)/2;
    
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++){     
            if(nums[i]==nums[i+1]){
                count++;
                if(count>n) return nums[i];
            }
            else{
                count=1;
            }
        }
        return 0;
    }
}