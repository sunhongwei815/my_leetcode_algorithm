package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午10:09
 * File Description：最长公共前缀: 查找字符串数组中的最长公共前缀。
 *
 * 依次取每个字符串和第一个进行比较
 */
public class demo014 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }

        for(int i=0;i<strs[0].length();i++){  //第一个字符串长度
            for(int j=1;j<strs.length;j++){   //数组长度
                if(strs[j].length()<=i){
                    return strs[0].substring(0,i);
                }
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
