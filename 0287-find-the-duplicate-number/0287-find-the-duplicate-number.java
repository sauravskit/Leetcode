class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int temp:nums){
            if(set.contains(temp)) return temp;
            set.add(temp);
        }
        return 0;
    }
    
}