/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode=head;
        int count=1;
        while(tempNode.next!=null){
            tempNode=tempNode.next;
            count++;
        }
        tempNode=head;
        if(count==n){
            ListNode newhead=tempNode.next;
            head=null;
            return newhead;
        }
        
        int temp=count-n;
        
        while(tempNode!=null){
            temp--;
            if(temp==0){
                break;
            }
            tempNode=tempNode.next;
        }
        if(n==1){
            tempNode.next=null;
            tempNode=null;
        }
        else{
        ListNode nodedel=tempNode.next;
        tempNode.next=tempNode.next.next;
        nodedel=null;
        
        }
        return head;
    }
}