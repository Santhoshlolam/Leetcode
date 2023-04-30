/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      /*  HashMap<ListNode,ListNode> ok=new HashMap<ListNode,ListNode>();
        
        Node headb=new Node();
        Node temp=headb;
        while(temp!=null)
        {
            Node temp1=new Node();
            temp.next=temp1;
        }
        Node temp1=head;
        Node temp2=headb;
        while(temp1!=null)
        {
            ok.put(temp1,temp2);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        temp1=head;
        temp2=headb;
        while(temp1!=null)
        {
            temp2.random=ok.get(temp1.random);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
    return headb;   */
        if(head==null)
            return null;
       // if(head.next==null && head.random==null)
         //   return head;
        Node temp=head;
        Node headb=new Node(temp.val);
        Node tmp=headb;
        temp=temp.next;
        while(temp!=null)
        {
            Node temp1=new Node(temp.val);
            tmp.next=temp1;
            tmp=tmp.next;
            temp=temp.next;
        }
        tmp=null;
        temp=headb;
      /*  while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }  */
        
        
        
        
        HashMap<Node,Node> ok=new HashMap<Node,Node>();
        Node l=head;
        Node l1=headb;
        
        while(l!=null)
        {
            ok.put(l,l1);
            l=l.next;
            l1=l1.next;
        }
        l=head;
        l1=headb;
        while(l!=null)
        {
            l1.random=ok.get(l.random);
            l=l.next;
            l1=l1.next;
        }
        
        
   return headb;
        
        
    }
}