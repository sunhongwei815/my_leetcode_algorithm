package demo001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午3:49
 * File Description：括号生成：给出 n 代表生成括号的对数，
 *                   请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 *
 *  回溯法，并且在过程中始终保证右括号的数量不能超过左括号
 */
public class demo022 {
    List<String> results=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        trackback("",n,0,0);
        return  results;
    }

    public void trackback(String s,int n,int numleft,int numright){
        if(s.length()==n*2){
            results.add(s);
            return;
        }
        //如果左括号没到上限，可以加入左括号
        if(numleft<n) trackback(s+'(',n,numleft+1,numright);
        //如果左括号比右括号多，可以加入右括号
        if(numleft>numright) trackback(s+')',n,numleft,numright+1);

    }
}
