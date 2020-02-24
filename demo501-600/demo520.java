package demo501_600;

/**
 * @author:Sun Hongwei
 * @2020/2/24 下午4:43
 * File Description：检测大写字母:给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 1.全部字母都是大写，比如"USA"。
 * 2.单词中所有字母都不是大写，比如"leetcode"。
 * 3.如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 */
public class demo520 {
    public boolean detectCapitalUse(String word) {
        int count=0;
        int index=0;
        if(word.length()==1) return true;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)-'A'<=25){  //大写字母
                count++;
                index=i;
            }
        }
        //根据条件判断
        if(count==word.length() || count==0) return true;
        if(index==0) return true;
        return false;
    }
}
