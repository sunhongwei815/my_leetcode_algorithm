package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午11:08
 * File Description：旋转链表:给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，
 *                          其中 k 是非负数。
 *hou
 *1.设置双指针，现将fast后移k个节点，然后同步向后遍历，
 * 所以fast到最后一个节点时，slow到新链表的链尾
 * 2.将原来链尾指向head,新的链尾的next设为null
 *
 */
public class demo061 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode fast=head,slow=head;

        while(k>0){
            if(fast.next==null){
                fast.next=head;
                fast=head;
            }else{
                fast=fast.next; //现将fast后移k个单位
            }
            k--;
        }
        while(fast.next!=head && fast.next!=null){
            fast=fast.next;
            slow=slow.next;  //将slow和fast同步往后遍历，最终slow到达新的链尾
        }

        if(fast.next==null){
            fast.next=head; //链尾指针指向head；
        }
        ListNode temp=slow;
        slow=slow.next;
        temp.next=null;  //temp现在是新的链尾指针，指向null
        return slow;
    }
}
