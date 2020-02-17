package demo001_100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Sun Hongwei
 * @2020/2/17 上午10:16
 * File Description：无重复字符的最长子串:给定一个字符串,请你找出其中不含有重复字符的最长子串的长度。
 *
 *
 * 滑动窗口（双指针储存），并用hashmap保存窗口内字符的位置
 */
public class demo003 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        int maxLength=0;
        for(int end=0,start=0;end<s.length();end++){
            if(map.containsKey(s.charAt(end))){
                //如果遇见重复字符，更新start
                start=Math.max(start,map.get(s.charAt(end))+1);
            }
            //更新当前最大长度
            maxLength=Math.max(maxLength,end-start+1);
            map.put(s.charAt(end),end);
        }
        return maxLength;
    }

}
