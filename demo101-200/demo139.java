package demo101_200;

import java.util.*;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午9:53
 * File Description：单词拆分: 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，
 *                      判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 说明：
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 *
 *
 * BFS,宽度优先遍历
 */
public class demo139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet(wordDict); //把list元素移至hashset中
        Queue<Integer> q=new LinkedList<>();
        int[] visited=new int[s.length()];
        q.add(0);
        while(!q.isEmpty()){
            int start=q.remove();
            if(visited[start]==0){
                for(int end=start+1;end<=s.length();end++){
                    //如果有部分字段在hashset中，将字段后一位的下标加入队列中
                    if(wordDictSet.contains(s.substring(start,end))){
                        q.add(end);
                        if(end==s.length()){
                            return true;
                        }
                    }
                }
                visited[start]=1;
            }
        }
        return false;
    }
}
