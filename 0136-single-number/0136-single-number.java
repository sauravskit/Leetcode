class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
       
        for(int i =0 ; i<nums.length-1;i++){
             System.out.println(nums[i]);
             System.out.println(nums[i+1]);
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            i++;
        }
        return nums[nums.length-1];
    }
   
}