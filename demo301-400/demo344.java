package demo301_400;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:33
 * File Description：反转字符串: 将输入的字符串反转过来,
 *                  必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 额外设置个变量temp，前后交换即可
 */
public class demo344 {
    public static void reverseString(char[] s) {
        char temp='a';
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
        for(char c:s){
            System.out.print(c+" -> ");
        }

    }

    public static void main(String[] args) {
        char[] x=new char[]{'h','e','l','l','o'};
        reverseString(x);
    }
}
