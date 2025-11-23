class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        for(int[] interval :intervals){
            /*here we are comparing lets say [1,3],[8,10] -> where 1,3 has been added to the new list(result)
            and 8,10 is the new array coming from interval if result last node is less than interval first node
            then that is a new interval i.e 3<8 so [1,3],[8,10] 

            for else if result(new list) last node is greater then it means it can encapsulate the interval in itself but 
            we have check the last element if it is less or gerater than the range of our existing new node.
            eg [4,8] [3,7] ->3 is less than 4 but 7 is also coming under the range of new list (result)   
            */
            if(result.isEmpty()||result.get(result.size() - 1)[1]<interval[0]){
                result.add(interval);
            }
            
            else{
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1],interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}