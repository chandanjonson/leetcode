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
    public ListNode deleteMiddle(ListNode head) {
     
        if(head.next ==null) return null;
        ListNode first = head;
        ListNode second = head;
        ListNode prev = head;
        while(second != null && second.next != null){
          
            prev= first;
            prev = first;
            first = first.next;
            second = second.next.next;
        }
        if(prev != null && prev.next != null){
            prev.next = prev.next.next;
        }

        return head;
    }
}