class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int temp:nums){
            if(set.contains(temp)) return true;set.put(temp);
        }
        return false;
    }
}
