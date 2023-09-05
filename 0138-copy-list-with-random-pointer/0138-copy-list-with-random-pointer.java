/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Node temp = head;
        while(temp != null){
            Node t = new Node(temp.val);
            t.next = temp.next;
            temp.next = t;
            temp = temp.next.next;
        }
        temp = head;
        while(temp != null){
            if(temp.random != null){
            temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node cur = head.next;
        Node t1 = cur;
        while(temp != null){
            temp.next = temp.next.next;
            temp = temp.next;
            if(temp != null){
                cur.next = cur.next.next;
                cur = cur.next;
            }
            
        }
        
        return t1;
    }
}