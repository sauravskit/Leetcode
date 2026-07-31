class Solution {
    public boolean containsDuplicate(int[] nums) {
 
        HashSet<Integer> set=new HashSet<>();
        for(int temp:nums){
            if(!(set.add(temp))) return true;
            
        }
        return false;
    }
    
}