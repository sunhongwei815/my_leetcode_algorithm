import java.lang.reflect.Array;
import java.util.*;

/**
 * @author:Sun Hongwei
 * @2020/2/11 下午6:46
 * File Description：两个数组的交集 II:  给定两个数组，编写一个函数来计算它们的交集。
 *
 * 1.输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 2.我们可以不考虑输出结果的顺序。
 *
 * 先排序，再用两个指针依次遍历
 */
public class demo350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //先排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res=new int[Math.min(nums1.length,nums2.length)];
        int l1=0,l2=0,k=0;
        //依次往后遍历，遇到相同的数加进res中
        while(l1<nums1.length && l2<nums2.length){
            if(nums1[l1]<nums2[l2]){
                l1++;
            }else if(nums1[l1]>nums2[l2]){
                l2++;
            }else{
                res[k++]=nums1[l1];
                l1++;l2++;
            }
        }
        return Arrays.copyOf(res,k);
    }
}
