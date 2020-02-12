package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午9:30
 * File Description：合并两个有序链表:将两个有序链表合并为一个新的有序链表并返回。
 *                              新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 *
 *   两个链表依次向后遍历比较大小加入新的链表
 */
public class demo021 {
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
