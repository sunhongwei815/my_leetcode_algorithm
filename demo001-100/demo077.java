package demo001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/21 下午10:16
 * File Description：组合: 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 *
 *
 * 回溯法
 */
public class demo077 {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(new ArrayList<Integer>(),1,n,k);
        return result;
    }

    private void backtrack(ArrayList<Integer> current,int first,int n,int k){
        if(current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=first;i<=n;i++){
            current.add(i);
            backtrack(current,i+1,n,k);
            current.remove(current.size()-1);
        }
    }
}
