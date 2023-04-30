/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       /* if(headA==null && headB==null)
            return null;
        if(headA.next== headB.next)
            return headA;
        int l1=0;
        int l2=0;
        ListNode tmp=headA;
        while(tmp!=null)
        {
            l1++;
            tmp=tmp.next;
        }
        tmp=headB;
        while(tmp!=null)
        {
            l2++;
            tmp=tmp.next;
        }
       // System.out.println(l1+" "+l2);
        int d=Math.abs(l1-l2);
        if(l2>l1)
        {
            tmp=headB;
            while(d--!=0)
                tmp=tmp.next;
          //  System.out.println(tmp.val);
          ListNode  tmp2=headA;
            while(tmp!=tmp2)
            {
                //if(tmp==tmp2)
                  //  return tmp;
                tmp=tmp.next;
              //  System.out.println(tmp.val);
                tmp2=tmp2.next;
               // System.out.println(tmp2.val);
                 if(tmp==tmp2)
                    return tmp;
            }
        }
        else
        {
            tmp=headA;
            while(d--!=0)
                tmp=tmp.next;
           ListNode tmp2=headB;
            while(tmp!=tmp2)
            {
  //              if(tmp==tmp2)
    //                return tmp;
                tmp=tmp.next;
                tmp2=tmp2.next;
                if(tmp==tmp2)
                    return tmp;
  
            }
        }  */
        
      ArrayList<ListNode> ok=new ArrayList<ListNode>();
        
        ListNode tmp=headA;
        while(tmp!=null)
        {    ok.add(tmp);
            tmp=tmp.next;}
        tmp=headB;
    while(tmp!=null)
    {
        if(ok.contains(tmp))
            return tmp;
        ok.add(tmp);
        tmp=tmp.next;
    }
                    
        
        
        
        
        
        
        return null;
    }
}