class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int temp:nums){
            int frequency=map.getOrDefault(temp,0)+1;
            map.put(temp,frequency);
            if(frequency>1) return true;
        }
        return false;
    }
}
