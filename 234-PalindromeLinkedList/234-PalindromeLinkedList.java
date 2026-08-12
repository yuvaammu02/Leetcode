// Last updated: 12/08/2026, 12:14:42
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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;//find the mid(first half)
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;// one step
            fast = fast.next.next;//two step
        }
        ListNode prev = null;//reverrse thee elements after the mid(second half)
        ListNode present = slow;
        ListNode next = present.next;//likefibonacci
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        ListNode first = head;//compare the first haf and second half
        ListNode second = prev; 
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}