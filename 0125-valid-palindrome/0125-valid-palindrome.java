class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(s);
        int right = s.length()-1;
        int left = 0;
       
        while(right>=left){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
            return true;
    }
}