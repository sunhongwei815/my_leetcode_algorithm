package demo001_100;

import java.util.*;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午7:55
 * File Description：字母异位词分组:给定一个字符串数组，将字母异位词组合在一起。
 *                          字母异位词指字母相同，但排列不同的字符串。
 *
 *
 *  用hashmap分类：现将string转化成char[]，再排序，判断是否属于同一类
 */
public class demo049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        Map<String,List> ans=new HashMap<String, List>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c); //排序后再转为字符串
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList()); //没有的话重新创建一个ArrayList
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values()); //将hashmap的value转化为ArrayList
    }
}
