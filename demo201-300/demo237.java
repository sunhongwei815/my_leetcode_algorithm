package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午4:07
 * File Description：删除链表中的节点:使其可以删除某个链表中给定的（非末尾）节点，
 *                                  将只被给定要求被删除的节点。
 */
public class demo237 {
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
