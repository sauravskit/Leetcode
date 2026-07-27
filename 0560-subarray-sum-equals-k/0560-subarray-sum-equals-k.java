class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       int sum=0;
       int count=0;
        sum=0;
        int key=0;
    for(int i = 0;i<nums.length;i++){
        sum+=nums[i];
        key=sum-k;
        if(map.containsKey(key)){
            count+=map.get(key);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }

    return count;
}
}


//[1 2 3 4  i5 6  7j 8,-24] key =  18
// Prefix
// [1,3,6,10,15,21,28,34]

// 28-10=18
// 28-18=10 


// Hash map <sum,count>


