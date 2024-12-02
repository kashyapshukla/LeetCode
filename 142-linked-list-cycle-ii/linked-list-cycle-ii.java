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
    public ListNode detectCycle(ListNode head) {

        if(head==null){
            return null;
        }

        if(head==head.next){
            return head;
        }

        if(head.next==null){
            return null;
        }


        ListNode slow=head;
        ListNode fast=head;

        do{

            if(fast==null || fast.next==null){
                return null;
            }

            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);


        while(head!=slow){
            slow=slow.next;
            head=head.next;
        }


        return head;
        
    }
}