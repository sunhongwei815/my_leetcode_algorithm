package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午12:55
 * File Description：左旋转字符串:字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 *
 * 翻转三次
 */
public class m58_2 {
    private char[] chars;
    public String reverseLeftWords(String s, int n) {
        if(n>s.length()) return s;
        chars=s.toCharArray();
        //翻转
        reverse(0,n-1);
        reverse(n,s.length()-1);
        reverse(0,s.length()-1);

        return new String(chars);
    }
    private void reverse(int i,int j){
        char t;
        while(i<j){
            t=chars[i];
            chars[i]=chars[j];
            chars[j]=t;
            i++;
            j--;
        }
    }
}
