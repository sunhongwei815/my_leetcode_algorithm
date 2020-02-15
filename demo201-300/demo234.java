package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/15 下午3:34
 * File Description：回文链表:判断一个链表是否为回文链表。
 *
 *
 * 1.快慢指针：先设置两个指针fast（每次2步）,slow（每次一步），当fast到链尾时，slow正好到中间一半位置
 * 2.slow后面的节点倒序
 * 3.判断时候回文
 */
public class demo234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true; //空链表，或者只有一个节点
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        //slow 后面节点倒序：
        ListNode preNode=null;
        ListNode nextNode=null;
        ListNode currentNode=slow.next;
        while(currentNode!=null){
            nextNode = currentNode.next;
            currentNode.next= preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }

        //分别从一头一尾开始遍历
        slow=head;
        while(preNode!=null){
            if(preNode.val!=slow.val) return false;
            preNode=preNode.next;
            slow=slow.next;
        }
        return true;
    }
}
