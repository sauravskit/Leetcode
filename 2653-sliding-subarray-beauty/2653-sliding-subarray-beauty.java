class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int [] ans = new int[nums.length - k +1];
        int [] hash = new int[101];

        for(int i = 0 ; i<k;i++){
            hash[nums[i]+50]++;
        }

        ans[0] = xsmallestNum(hash,x);
        for(int i=k ;i<nums.length;i++){
            hash[nums[i-k]+50]--;
            hash[nums[i]+50]++;

            ans[i-k+1] = xsmallestNum(hash,x);
        }
      
        return ans;
    }

    private int xsmallestNum(int [] hash,int x){
        int count=0;
        for(int i =0 ; i<50;i++){
            count+=hash[i];
            if(count>=x) return i -50;
        }
        return 0;
    }
}