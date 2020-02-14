package demo001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/10 上午12:25
 * File Description：子集:给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 回朔法（递归）
 */
public class demo078 {
    List<List<Integer>> results=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,new ArrayList<Integer>(),0);
        return results;
    }

    //回溯
    public void backtrack(int[] nums,ArrayList<Integer> temp, int start){
        results.add(new ArrayList<>(temp));

        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
