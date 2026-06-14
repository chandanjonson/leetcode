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
    public int pairSum(ListNode head) {
        //first divide the linked list by half using two pointer
        //reverse the second linked list
        //comapre two linked list and find the max number
        ListNode first = head;
        ListNode second = head.next;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        
        var newhead = reverse(first.next);
        int max = 0;
        var p1 = head;
        var p2 = newhead;
        while (p1 != null && p2 != null) {
            max = Math.max(max,p1.val + p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }

        return max;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp =head;
        while(temp != null){
            temp = temp.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
   
        }
        return prev;
    }
}