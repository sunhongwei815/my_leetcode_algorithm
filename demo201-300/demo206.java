package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:56
 * File Description：反转链表:反转一个单链表。
 *
 * 在遍历列表时，将当前节点的 next 指针改为指向前一个元素。由于节点没有引用其上一个节点，
 * 因此必须事先存储其前一个元素。在更改引用之前，还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
 *
 *
 *
 */
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

        while(curr!=null){  //将链表每个node的next改到前一个node
            ListNode nexttemp=curr.next;
            curr.next=result;
            result=curr;
            curr=nexttemp;
        }
        return result;
    }
}
