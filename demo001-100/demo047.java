package demo001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/13 下午4:54
 * File Description：全排列 II:给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 *
 * 回溯+剪枝
 * 由于有重复数字，先排序，再在回溯的过程中和前一个数比较，观察是否重复
 */
public class demo047 {

    List<List<Integer>> results=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] visited=new int[nums.length];
        Arrays.sort(nums); //排序后方便比较
        trackback(nums,new ArrayList<Integer>(),visited);
        return results;
    }

    public void trackback(int[] nums,ArrayList<Integer> temp,int[] visited){
        if(temp.size()==nums.length){
            results.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            //有重复数字的时候，多加一个判断条件作为剪枝处理:是否和前一个数相同（有序数列里）
            if(visited[i]==1 || ( i>0 && nums[i]==nums[i-1] &&
                    visited[i-1]==0)){
                //visited[i-1]==0说明和此数相同的那个数不在该排列里
                continue;
            }

            visited[i]=1;
            temp.add(nums[i]);

            trackback(nums,temp,visited);
            temp.remove(temp.size()-1);
            visited[i]=0;
        }
    }
}
