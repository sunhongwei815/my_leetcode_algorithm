package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午1:27
 * File Description：第一个只出现一次的字符:在字符串s中找出第一个只出现一次的字符。
 *                    如果没有，返回一个单空格。
 *
 * 用hash方法
 */
public class m50 {
    public char firstUniqChar(String s) {
        int[] count=new int[26];
        char ans=' ';
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(count[c-'a']==1){
                ans=c;
                break;
            }
        }
        return ans;
    }
}
