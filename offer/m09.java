package offer;

import java.util.Stack;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午10:32
 * File Description：用两个栈实现队列: 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *
 *删除队头元素： 若stack2为空，把stack1中的元素全部取出压入到stack2中即可
 */
public class m09 {
    class CQueue {
        private Stack<Integer> stack1;  //stack1用于储存元素
        private Stack<Integer> stack2;  //stack2用于辅助，操作删除队头元素

        public CQueue() {
            stack1=new Stack();
            stack2=new Stack();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if(stack1.isEmpty() && stack2.isEmpty()){
                return -1;
            }
            if(stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }
}
