public class demo021 {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x){
          val=x;
      }
  }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(1);
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(3);
        ListNode l5=new ListNode(4);
        ListNode l6=new ListNode(4);
        l1.next=l3;l3.next=l5;
        l2.next=l4;l4.next=l6;
        ListNode result=mergeTwoLists(l1,l2);
        System.out.print(result.val);
        while(result.next!=null){
            result=result.next;
            System.out.print("->"+result.val);
        }

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          ListNode prehead=new ListNode(-1);
          ListNode prev=prehead;
          while (l1!=null && l2!=null){
              if(l1.val<=l2.val){
                  prev.next=l1;
                  l1=l1.next;
              }else{
                  prev.next=l2;
                  l2=l2.next;
              }
              prev=prev.next;
          }
          prev.next=l1==null?l2:l1;
          return prehead.next;
    }
}
