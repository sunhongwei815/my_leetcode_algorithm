import java.util.HashSet;
import java.util.Set;

/**
 * @author:Sun Hongwei
 * @2020/2/10 下午1:42
 * File Description：存在重复元素 II:给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 *
 *改进版hashset: 设置一个大小为k的hashset,如果满了的话删除第n-k个元素
 *
 */
public class demo219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0) return false;
        Set<Integer> set=new HashSet<Integer>(k);
        for(int n=0;n<nums.length;n++){
            if(set.contains(nums[n])) return true;
            if(set.size()==k) set.remove(nums[n-k]); //hashset满了就删除第n-k个元素
            set.add(nums[n]);
        }
        return false;
    }
}
