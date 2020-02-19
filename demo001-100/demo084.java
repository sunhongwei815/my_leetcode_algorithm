package demo001_100;

import java.util.Stack;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午8:26
 * File Description：柱状图中最大的矩形:给定 n 个非负整数，用来表示柱状图中各个柱子的高度。
 *            每个柱子彼此相邻，且宽度为 1 。求在该柱状图中，能够勾勒出来的矩形的最大面积。
 *
 *
 *用栈储存：
 * 1.若当前高度小于之前的，依次按照计算高度之前的最大面积，比较后并弹出
 * 2.遍历一遍后，用当前的最小高度乘上n进行比较
 */
public class demo084 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(-1);
        int maxarea=0;
        //压入栈中，遍历
        for(int i=0;i<heights.length;i++){
            while (stack.peek()!=-1 && heights[stack.peek()]>=heights[i]){
                maxarea=Math.max(maxarea,heights[stack.pop()]*(i-stack.peek()-1));
            }
            stack.push(i);
        }
        //将栈中剩余元素弹出栈
        while (stack.peek()!=-1){
            maxarea=Math.max(maxarea,heights[stack.pop()]*
                    (heights.length-stack.peek()-1));
        }
        return maxarea;
    }
}
