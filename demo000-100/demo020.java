package demo001_100;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午9:33
 * File Description：有效的括号:给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，
 *                             判断字符串是否有效.
 *
 *                      (1)左括号必须用相同类型的右括号闭合。
 *                      (2)左括号必须以正确的顺序闭合。
 *
 *
 *  利用栈的数据结构，遇到匹配的弹出栈，出现不匹配的情况直接return false;
 */
public class demo020 {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        //if(s.length()>0 && !map.containsKey(s.charAt(0))) return false;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                //如果出现了右括号，找栈的顶端元素
                char top=stack.empty()?'#':stack.pop();
                System.out.println(s.charAt(i)+": "+top);
                //栈顶元素不匹配:return false;
                if(top!=map.get(s.charAt(i)))  return false;
            }else{
                //没出现右括号，则把字符放进栈里
                stack.push(s.charAt(i));
            }

        }
        return stack.isEmpty();

    }
}
