/**
 * @author:Sun Hongwei
 * @2020/2/9 下午9:39
 * File Description：编写一个程序，找到两个单链表相交的起始节点
 *双指针法：两个指针分别走完a和b后，换个链表走，第一次相遇的节点就是公共节点
 */
public class demo160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode pa=headA;
        ListNode pb=headB;
        while (pa!=pb){  //当一个链表走完后，走另一个链表
            pa=(pa==null)?headB:pa.next;
            pb=(pb==null)?headA:pb.next;

        }
        return pa;

    }

}
