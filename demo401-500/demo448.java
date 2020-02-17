package demo401_500;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/16 下午10:41
 * File Description：找到所有数组中消失的数字: 给定一个范围在1 ≤ a[i] ≤ n ( n = 数组大小 )
 *                      的整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *                 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 *
 *
 * hash方法：设置一个数组统计出现次数，在遍历一遍找到个数是0的地方
 */
public class demo448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] count=new int[nums.length+1];
        for(int n:nums){
            count[n]++;
        }

        List<Integer> result=new ArrayList<Integer>();
        for (int i=1;i<count.length;i++){
            if(count[i]==0){
                result.add(i);
            }
        }

        return result;
    }
}
