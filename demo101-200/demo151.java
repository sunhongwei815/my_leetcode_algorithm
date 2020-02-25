package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午8:11
 * File Description：翻转字符串里的单词: 给定一个字符串，逐个翻转字符串中的每个单词。
 *
 * 用split(" ")分割单词
 */
public class demo151 {
    public String reverseWords(String s) {
        String[] ss=s.trim().split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=ss.length-1;i>=0;i--){
            if(!ss[i].isEmpty()){   //防止原字符串空了两格
                stringBuilder.append(ss[i]);
                if (i != 0) {
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
