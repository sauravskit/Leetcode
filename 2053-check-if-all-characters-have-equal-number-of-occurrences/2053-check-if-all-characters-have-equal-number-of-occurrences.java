class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=map.get(s.charAt(0));
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()!=count) return false;
        }
        return true;
    }
}