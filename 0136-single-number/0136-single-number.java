class Solution {
    public int singleNumber(int[] nums) {
        int res=0;//a ^ 0 = a (a number XOR 0 remains unchanged)
        for(int i : nums){
            res^=i;
        }
        return res;
    }
   
}