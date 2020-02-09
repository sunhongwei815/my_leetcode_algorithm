import com.sun.tools.javac.util.Name;

/**
 * @author:Sun Hongwei
 * @2020/2/9 下午9:28
 * File Description：给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * （除了字母顺序不同，其他都一样）
 * 方法：hash表
 */
public class demo242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] alpha=new int[26];
        for(char i:s.toCharArray()){  //遍历第一个数组，把每个字母出现的地方+1
            alpha[i-'a']++;
        }
        for(char j:t.toCharArray()){
            alpha[j-'a']--;    //遍历第二个数组，把每个字母出现的地方-1
            if(alpha[j-'a']<0) return false;  //如果某个位置小于0，提前结束，返回错误
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));

    }

}
