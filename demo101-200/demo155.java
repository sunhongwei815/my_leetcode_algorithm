package demo101_200;

import java.util.Stack;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午4:38
 * File Description：最小栈:设计一个支持push,pop,top操作,并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 *
 *设置一个辅助栈，存储当前的最小元素，则GETMIN时取辅助栈的peek()即可
 */
public class demo155 {
    class MinStack {
        private Stack<Integer> helper;
        private Stack<Integer> stack;

        /** initialize your data structure here. */
        public MinStack() {
            stack=new Stack<>();
            helper=new Stack<>(); //辅助栈,存储当前最小元素
        }

        public void push(int x) {
            stack.push(x);
            if(!helper.isEmpty()){
                int top=helper.peek();
                if(x<=top){   //如果当前x不大于辅助栈的栈顶元素，则存储在辅助栈里
                    helper.push(x);
                }
            }else{
                helper.push(x);
            }

        }

        public void pop() {
            int pop=stack.pop();
            int top=helper.peek();
            if(pop==top){  //如果当前弹出的元素在helper里面，则一起弹出
                helper.pop();
            }

        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return helper.peek();
        }
    }
}
