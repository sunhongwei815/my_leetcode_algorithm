package offer;

import java.util.Stack;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午7:58
 * File Description：从尾到头打印链表: 输入一个链表的头节点，从尾到头反过来返回每个节点的值
 *                                 （用数组返回）。
 *
 *用栈的方法，遍历链表，先进后出
 */
public class m06 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        while(head!=null){
            stack.push(head.val);
         //   System.out.println(head.val);
            head=head.next;
        }
        int[] ans=new int[stack.size()];
        int i=0;
        while(!stack.empty()){
         //   System.out.println(stack.peek());
            ans[i++]=stack.pop();
        }
        return ans;

    }
}
