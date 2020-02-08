public class demo206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode result=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode nexttemp=curr.next;
            curr.next=result;
            result=curr;
            curr=nexttemp;
        }
        return result;
    }

}
