class Solution {
    public int beautySum(String s) {
        int ans=0;
        int n=s.length();
      
        for(int i=0;i<n;i++){  // nested loop for finding all substring
            int freq[] =new int[26];//will note frq of each char for each 
            for(int j= i;j<n;j++){
               freq[s.charAt(j)-'a']++;
               int max_freq=getmax(freq);
               int min_freq=getmin(freq);
               int beauty=max_freq-min_freq;
               ans+=beauty;
            }
        }
        return ans;
    }
    public int getmax(int [] freq){
        int max=Integer.MIN_VALUE;
        for(int a: freq){
            if(a!=0)
            max=Math.max(a,max);
        }
        return max;
    }
    public int getmin(int [] freq){
        int min=Integer.MAX_VALUE;;
        for(int a: freq){
            if(a!=0)
            min=Math.min(a,min);
        }
        return min;
    }
}