public class demo019 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1) return null;
        ListNode temp=head;
        ListNode result=head;
        while (n!=0){
            n--;
            temp=temp.next;
        }
        if(temp==null){
            return result.next;
        }
        while(temp.next!=null){
            head=head.next;
            temp=temp.next;
        }
        head.next=head.next.next;
        return result;

    }

}
