class Solution {
    public String reverseWords(String s) {
        int i=0;
      
        String newString="";
       while(i < s.length()){
       
        while(i<s.length() && s.charAt(i) == ' ') i++;
            
        if(i>=s.length()) break;
        
       int  j=i+1;
        while(j<s.length() && s.charAt(j) != ' ') j++;
        
        String word=s.substring(i,j);
        i=j+1;
        if(newString.isEmpty()) newString=word;
        else newString=word + " " + newString;
       }
    
       return newString;

    }
}