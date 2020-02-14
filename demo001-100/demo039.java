package demo001_100;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午2:27
 * File Description：组合总和:  给定一个无重复元素的数组 candidates 和一个目标数 target ，
 *                         找出 candidates 中所有可以使数字和为 target 的组合。
 *                        candidates 中的数字可以无限制重复被选取。
 *
 *
 * 回溯法: 依次加进list中，直到超过target则返回
 */
public class demo039 {
    List<List<Integer>> results=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);  //排序，方便回溯时提前终止
        trackback(candidates,target,new ArrayList<Integer>(),0);
        return results;
    }

    public void trackback(int[] nums,int target,ArrayList<Integer> temp,int start){
        if(target==0){
            results.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;  //列表里加起来的值已经超过target

        for(int i=start;i<nums.length;i++){
            if(nums[i]>target) break;

             //回溯
            temp.add(nums[i]);
            trackback(nums,target-nums[i],temp,i);
            temp.remove(temp.size()-1);
        }

    }
}
