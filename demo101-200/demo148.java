package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/22 下午12:22
 * File Description：排序链表: 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 *
 *  1.因为时间复杂度O(n logn),所以采用归并排序
 *  2.归并排序的过程包括先 递归 将链表分割，排好序后再合并
 */
public class demo148 {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        //用快慢指针将链表分为左右两部分
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode tail=slow.next;
        slow.next=null;
        //递归，分成两个子部分分别排序
        ListNode left=sortList(head);
        ListNode right=sortList(tail);

        ListNode h=new ListNode(0);
        ListNode result=h;
        //归并的过程
        while(left!=null && right!=null){
            if(left.val<right.val){
                h.next=left;
                left=left.next;
            }else{
                h.next=right;
                right=right.next;
            }
            h=h.next;
        }
        //把剩余部分走完
        h.next=(left!=null)?left:right;
        return result.next;
    }
}
