package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午10:46
 * File Description：字符串的排列:输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 *
 *
 * 回溯+DFS+ 用hashset剪枝
 */
public class m38 {
    private String[] results;
    private List<String> ans;
    private char[] ss;
    private int[] visited; //标记访问位
    private int length;  //原字符串长度
    public String[] permutation(String s) {
        ss=s.toCharArray();  //原字符串转化为字符串数组
        //现将字符串数组内字符排序
        Arrays.sort(ss);
        length=s.length();
        visited=new int[length];
        ans=new ArrayList<String>();
        backtrack(new StringBuilder()); //回溯入口
        results=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            results[i]=ans.get(i);
        }
        return results;
    }

    //回溯
    private void backtrack(StringBuilder temp){
        if(temp.length()==length){
            ans.add(new String(temp));
            return;
        }

        for(int i=0;i<ss.length;i++){
            if(visited[i]==1){
                continue;
            }
            if(i>0 && ss[i]==ss[i-1] && visited[i-1]==0){
                continue;
            }
            visited[i]=1;
            temp.append(ss[i]);
            backtrack(temp);
            visited[i]=0;
            temp.delete(temp.length()-1,temp.length());
        }
    }

}
