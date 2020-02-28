package demo901_1000;

import java.util.Stack;

/**
 * @author:Sun Hongwei
 * @2020/2/28 下午6:12
 * File Description：栈的压入、弹出序列: 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 *      但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 *
 * 用一个stack模拟栈push和pop的过程
 */
public class demo946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for(int i:pushed){
            stack.push(i); //先依次把每个数压入栈里
            while(!stack.isEmpty() && j<popped.length && stack.peek()==popped[j]){
                //如果栈顶元素可以弹出
                stack.pop();
                j++;
            }
        }
        return j==popped.length; //栈内是否还有剩余
    }
}
