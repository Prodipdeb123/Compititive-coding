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
    public ListNode swapPairs(ListNode head) {
        ListNode temp1 = head;
        ListNode temp3 = null;
        boolean bool = true;

        while(temp1 != null && temp1.next != null){
            ListNode temp2 = temp1.next;
            temp1.next = temp2.next;
            temp2.next = temp1;

            if(temp3 != null)
                temp3.next = temp2;

            if(bool){
                head = temp2;
                bool = false;
            }

            if(!bool)
                temp3 = temp1;

            temp1 = temp1.next;

            if(temp1 == null)
                break;

            temp2 = temp1.next;
        }

        return head;
    }
}
// UP-VOTE IF HELPFUL