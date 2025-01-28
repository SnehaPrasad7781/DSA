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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode temp=head;
        ListNode temp2=(temp!= null) ? temp.next : null;
        while(temp!=null && temp2!= null){
            if(temp2.val==val){
                temp.next=temp2.next;
                temp2 = temp2.next;
            }
            else{
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        return head;
    }
}