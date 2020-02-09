/**
 * @author:Sun Hongwei
 * @2020/2/9 下午9:00
 * File Description：奇偶链表：给定一个单链表，把所有的奇数节点和偶数节点分别排在一起
 * (链表内部点的细节移动）
 */
public class demo328 {
    public static ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head; //奇数节点
        ListNode even=head.next; //偶数节点
        ListNode even_head=even;  //偶数节点链表第一个
        while (even!=null && even.next!=null){
            odd.next=even.next;
            even.next=even.next.next;
            //两个数组分别向后遍历
            odd=odd.next;
            even=even.next;
        }
        odd.next=even_head;
        return head;
    }
}
