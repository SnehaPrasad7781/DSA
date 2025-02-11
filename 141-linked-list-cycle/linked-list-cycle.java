/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;






        //HASH TABLE
        // ListNode temp=head;
        // HashSet<ListNode> set = new HashSet<>();
        // while(temp!=null){
        //     if(set.contains(temp.next)){
        //     return true;
        //     }
        //     set.add(temp);
        //     temp=temp.next;
        // }
        // return false;
    }
}