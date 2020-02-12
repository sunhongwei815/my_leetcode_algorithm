package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午8:02
 * File Description：回文数:判断一个整数是否是回文数。回文数是指正序（从左向右）和
 *                         倒序（从右向左）读都是一样的整数。
 *
 *
 * 转换成字符串，然后两个指针分别从前面和从后面遍历
 */
public class demo009 {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=x+"";       //把整数变成字符串
        char in[]=s.toCharArray();  //把
        int i=0,j=s.length()-1;
        while(i<=j){
            if(in[i]!=in[j]){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        int x=121;
        boolean flag=isPalindrome(x);
        System.out.println(flag);
    }
}
