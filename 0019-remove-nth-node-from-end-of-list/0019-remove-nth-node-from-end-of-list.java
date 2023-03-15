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
      /*  ListNode h1=head;
        int count=0;
        
        while(h1!=null)
        {
            count++;
            h1=h1.next;
        }
        if(count==1 && n==1)
            return null;
      //  System.out.println(count);
       // return head;
     if(count==n)
         return head.next;
        int ele=count-n-1;
        ListNode h2=head;
        ListNode h3=head.next;
        while(ele--!=0)
        {
            h2=h2.next;
            h3=h2.next;
           // ele--;
        }
        h2.next=h3.next;
        return head;  */
        
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++)
            fast=fast.next;
        if(fast==null)
            return head.next;
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return head;
    }
}