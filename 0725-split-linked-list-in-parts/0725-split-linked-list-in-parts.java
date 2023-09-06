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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count=0;
        ListNode[] ans = new ListNode[k];
        if(k==0 || head == null)
        return ans;
        ListNode temp = head;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        int size = count/k;
        int rem = count%k;
        if(count<k)
        {
            size = 1;
            rem = 0;
        } 
        temp = head;
        for(int j=0; j<k; j++)
        {
            ListNode temphead = temp;
            if(temphead == null)
            {
                ans[j] = null;
                continue;
            }
            int torun = size;
            if(rem>0)
             {  
              torun++;
              rem--;
            }
            for(int i=0; i<torun-1; i++)
            {
                temp = temp.next;
            }
            ListNode agla = null;
            if(temp != null){
            agla = temp.next;
            temp.next = null;}
            ans[j] = temphead;
            temp = agla;
        }
        return ans;
    }
}