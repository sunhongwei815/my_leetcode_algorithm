/**
 * @author:Sun Hongwei
 * @2020/2/11 下午5:40
 * File Description：字符串中的第一个唯一字符:给定一个字符串，找到它的第一个不重复的字符，
 *                    并返回它的索引。如果不存在，则返回 -1。
 *
 *  方法：Hash表遍历一遍统计数目
 */
public class demo387 {
    public int firstUniqChar(String s) {
        int[] schar=new int[26];
        for(char c:s.toCharArray()){
            schar[c-'a']++;
        }
        for(int num=0;num<s.length();num++){
            if(schar[s.charAt(num)-'a']==1){
                return num;
            }
        }
        return -1;
    }
}
