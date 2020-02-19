package demo101_200;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午11:01
 * File Description：环形链表 II:
 *        给定一个链表，返回链表开始入环的第一个节点。如果链表无环，则返回 null。
 *        为了表示给定链表中的环，我们使用整数pos来表示链表尾连接到链表中的位置（索引从0开始）。
 *        如果 pos 是 -1，则在该链表中没有环。
 *
 *
 *
 * 用hashset保存遍历过的节点
 */
public class demo142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited=new HashSet<ListNode>();
        while(head!=null){
            if(visited.contains(head)){
                return head;
            }
            visited.add(head);
            head=head.next;
        }
        return null;
    }
}
