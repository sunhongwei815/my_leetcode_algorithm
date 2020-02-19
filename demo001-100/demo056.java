package demo001_100;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/16 下午10:02
 * File Description：合并区间:给出一个区间的集合，请合并所有重叠的区间。
 *
 *
 *
 * 先按照每个区间的start排序，排序之后再依次遍历对照end,判断是否能合并
 */
public class demo056 {
        public int[][] merge(int[][] intervals) {
            List<int[]> result = new ArrayList<>();
            if (intervals.length == 0) return new int[0][];
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            //遍历
            int i=0,left,right;
            while(i<intervals.length){
                left=intervals[i][0];
                right=intervals[i][1];
                while(i<intervals.length-1 && intervals[i+1][0]<=right){
                    //下一个子区间左边界在之前的右边界内
                    right=Math.max(right,intervals[i+1][1]);//扩大右边界
                    i++;
                }
                result.add(new int[]{left,right});
                i++;
            }
            return result.toArray(new int[0][]);
        }
}