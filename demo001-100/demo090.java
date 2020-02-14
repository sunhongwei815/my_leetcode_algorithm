package demo001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午2:15
 * File Description：子集 II:给定一个可能包含重复元素的整数数组nums,
 *                      返回该数组所有可能的子集（幂集）。
 *
 * 回溯，大致同78题，先排序，遍历时去掉重复的情况
 */
public class demo090 {
    List<List<Integer>> results=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<Integer>(),0);
        return results;
    }
    //回溯
    public void backtrack(int[] nums,ArrayList<Integer> temp, int start){
        results.add(new ArrayList<>(temp));

        for(int i=start;i<nums.length;i++){
            //改变的地方：如果前一个数相同已经被遍历过了，则跳过
            if(i>start && nums[i]==nums[i-1]) continue;

            temp.add(nums[i]);
            backtrack(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
