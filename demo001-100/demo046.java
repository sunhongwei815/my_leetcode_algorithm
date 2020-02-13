package demo001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/13 下午4:13
 * File Description：全排列：给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 *  回朔法：递归
 */
public class demo046 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int[] visited=new int[nums.length];   //visited:记录数组中元素是否被访问过
        backtrack(result,nums,new ArrayList<Integer>(),visited);
        return result;

    }

    public void backtrack(List<List<Integer>> res,int[] nums,ArrayList<Integer> temp,int[] visited){
        //填满一种组合后，放进ArrayLists
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
         //回溯
        for(int i=0;i<nums.length;i++){
            if(visited[i]==1){
                continue;
            }
            visited[i]=1;   //如果没遍历过这个元素，就把它放进去，继续遍历
            temp.add(nums[i]);
            backtrack(res,nums,temp,visited);

            visited[i]=0;  //将该元素弹出，换另一个元素进去
            temp.remove(temp.size()-1);
        }
    }
}
