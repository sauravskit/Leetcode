class Solution {
    public boolean rotateString(String s, String goal) {
       char[] arr = s.toCharArray();
       char temp =arr[0];
       int count = 0;
       while(count<=arr.length-1){
       for(int i =0 ;i<arr.length-1;i++){
        arr[i]=arr[i+1];
       }
       arr[arr.length-1]=temp;
      if( String.valueOf(arr).equals(goal)) return true;
      count++;
      temp=arr[0];
       }
      return false;
    }
    
}