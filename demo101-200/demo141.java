package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:18
 * File Description：环形链表:给定一个链表，判断链表中是否有环。
 *
 *
 *双指针问题：快慢指针，一个每次走两步，一个每次走一步，若有闭环一定会相遇
 *
 */
public class demo141 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next=null;
        }
    }
    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode fast=head.next;
        ListNode slow=head;
        while(slow!=fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;

    }
}
