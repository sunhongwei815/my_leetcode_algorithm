package demo501_600;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午10:21
 * File Description：反转字符串中的单词 III:给定一个字符串，
 *       你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 *
 * 先用String.split()分成一个个单词
 * 再用StringBuilder.reverse()反转
 */
public class demo557 {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            String newWord=new StringBuilder(word).reverse().toString();//每个word反转
            result.append(newWord+" ");
        }
        return result.toString().trim(); //String.trim():除去首位空格
    }
}
