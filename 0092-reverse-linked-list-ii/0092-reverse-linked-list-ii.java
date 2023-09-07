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
    public ListNode reverseBetween(ListNode head, int left, int right){
        if(left==right) return head;
        ListNode cur=head,prev=null,next=null;
        int count=1;
        while(cur!=null&&count!=left){
            count++;
            prev=cur;
            cur=cur.next;
        }
        ListNode one=prev;
        ListNode two=cur;
        prev=null;
        while(cur!=null&&count!=right+1){
            count++;
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            
        }
        if(one!=null) one.next=prev;
        if(two!=null) two.next=cur;
        
        
        if(left==1) return prev; 
        return head;

    }
}