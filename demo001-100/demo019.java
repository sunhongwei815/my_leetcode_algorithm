package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午9:39
 * File Description：删除链表的倒数第N个节点:给定一个链表，删除链表的倒数第 n 个节点，
 *                                    并且返回链表的头结点。
 *
 *  设置两个指针，fast和slow,让fast先走n个节点，然后两者同步，
 *     fast到链尾的时候，slow正好到要删除的位置
 *
 */
public class demo019 {
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
