class Solution {
    public int beautySum(String s) {
        int ans=0;
        int n=s.length();
      
         for (int i = 0; i < n; ++i) {
            Map<Character, Integer> m = new HashMap<>();
            for (int j = i; j < n; ++j) {
                m.put(s.charAt(j), m.getOrDefault(s.charAt(j), 0) + 1);  // Increment the frequency of the current character
                
                List<Integer> frequencies = new ArrayList<>(m.values()); //m.values() returns a collection of all the frequencies in the map m.
                int max_freq = Collections.max(frequencies);  // Find the maximum frequency
                int min_freq = Collections.min(frequencies);  // Find the minimum frequency
                
                ans += (max_freq - min_freq);  // Add the difference to the answer
            }
        }
        
        return ans;
    }
}
