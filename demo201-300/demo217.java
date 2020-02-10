import java.util.HashSet;
import java.util.Set;

/**
 * @author:Sun Hongwei
 * @2020/2/10 上午1:09
 * File Description：存在重复元素:给定一个整数数组，判断是否存在重复元素。
 *
 * hash表
 */
public class demo217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<Integer>(nums.length);
        for(int n:nums){
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }

}
