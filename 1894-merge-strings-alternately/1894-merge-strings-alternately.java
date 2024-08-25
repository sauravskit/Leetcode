class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=0;
        int b=0;
        String n="";
        while(a<word1.length() || b<word2.length()){
            if(a<word1.length())
            n=n+word1.charAt(a);
            if(a<word2.length())
            n=n+word2.charAt(b);
            a++;
            b++;
            
        }
        return n;
    }
}