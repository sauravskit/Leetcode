class Solution {
    public int fillCups(int[] amount) {
        int count=0;
				PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
				for(int i :amount) {
					pq.add(i);
				}
	             while(!pq.isEmpty()) {
	            	 int x=pq.poll();
	            	 if(x==0) break;
                     if(pq.isEmpty()){
                        count+=x;
                        break;
                     }
	            	 int y=pq.poll();
	            	 count++;
	            	 if(x-1>0) pq.add(x-1);
	            	 if(y-1>0) pq.add(y-1);
	             }
	             return count;
    }
}