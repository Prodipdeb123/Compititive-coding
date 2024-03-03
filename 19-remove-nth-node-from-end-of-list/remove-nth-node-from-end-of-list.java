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
        int number=0;
        ListNode current =head;
        
        while(current != null){
            number++;
            current=current.next;
        }
        int length= number-n;

        current = head;
        ListNode prev = head;

        int data=1;
        while(data <= length){
            prev = current;
            current = current.next;
            data++;

        }
        if(current==head){
            head=head.next;
        }
        else if(current.next==null){
            prev.next=null;
        }
        else{
            prev.next=current.next;
        }
        return head;
        
            
        
    }
}