class Solution {
    public int pivotIndex(int[] nums) {
        int preSum=0,postSum=0;
        for( int i = 0 ; i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                postSum+=nums[j];
            }
            if(postSum==preSum){
                return i;
            }
            preSum+=nums[i];
            postSum=0;
        }
        return -1;
    }
    }

        


