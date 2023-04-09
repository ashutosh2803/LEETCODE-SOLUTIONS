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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode h : lists){
            while(h != null){
                pq.add(h.val);
                h = h.next;
            }
        }
        ListNode newList = new ListNode(-1);
        ListNode curr = newList;
        while(pq.size() > 0){
            ListNode node = new ListNode(pq.remove());
            curr.next = node;
            curr = curr.next;
        }
        return newList.next;
    }
}