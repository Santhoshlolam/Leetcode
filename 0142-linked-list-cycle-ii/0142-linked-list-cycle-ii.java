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
        if(head==null)
            return  null;
        
        if(head.next==null || head.next.next==null)
            return null;
        
       /* ListNode slow=head;
        ListNode fast=head.next;
        boolean flag=true;
        
        while(fast!=null && fast.next!=null)
        {   if(slow==null || fast==null)
                 { flag=false;
                     break;}
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(flag==false)
            return null;
        System.out.println(fast.val);
        System.out.println(slow.val);
        ListNode p1=head;
        ListNode p2=slow.next;
        ListNode count=null;
        while(p1!=p2)
        {      count=p1;
            if(p1==p2)
                break;
            p1=p1.next;
            p2=p2.next;
        }
        return count;  */
        
    /*  ArrayList<ListNode> ok=new ArrayList<ListNode>();
       ListNode slow=head;
        ListNode fast=head.next;
        boolean flag=true;
        
       while(fast!=null && fast.next!=null)
       {   if(ok.contains(slow))
           return slow;
        else
           ok.add(slow);
           slow=slow.next;
           fast=fast.next;
           if(slow==fast)
               break;
       }   */
        
       ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        
        
        
        
        
     
       return null;    
    }
}