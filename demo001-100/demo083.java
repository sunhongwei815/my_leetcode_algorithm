package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/24 下午5:01
 * File Description：删除排序链表中的重复元素:给定一个排序链表，删除所有重复的元素，
 *                   使得每个元素只出现一次。
 *
 */


public class demo083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
        while (current!=null && current.next!=null){ //注意current在前面，curr.next在后面
            if(current.next.val==current.val){
                current.next=current.next.next;
            }
            else current=current.next; //一定要假设else,防止连续三个以上的重复
        }
        return head;
    }
}
