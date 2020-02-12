package demo701_800;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午10:23
 * File Description：宝石与石头: 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 *                      S中每个字符代表了一种你拥有的石头的类型，想知道拥有的石头中有多少是宝石。
 *
 * HashSet保存J中元素，然后S中遍历统计即可
 */
public class demo771 {
    public static int numJewelsInStones(String J, String S) {
        Set<Character> set=new HashSet<Character>();
        for(char j:J.toCharArray()){
            set.add(j);
        }
        int count=0;
        for(char s:S.toCharArray()){
            if(set.contains(s)) count++;
        }
        return count;

    }

    public static void main(String[] args) {
        String J="aA";
        String S="aAAbbbb";
        int x=numJewelsInStones(J,S);
        System.out.println(x);
    }
}
