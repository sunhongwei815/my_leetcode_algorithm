import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author:Sun Hongwei
 * @2020/2/11 下午7:08
 * File Description：两个数组的交集: 输出结果中的每个元素一定是唯一的。
 *
 *
 * hash表
 */
public class demo349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<Integer>(); //Set1存放nums1的值
        for(int n:nums1){
            set1.add(n);
        }

        Set<Integer> set2=new HashSet<Integer>(); //Set2存放nums2和nums1的交集
        for(int n:nums2){
            if(set1.contains(n)){
                set2.add(n);
            }
        }

        int[] res=new int[set2.size()]; //Set结果移至数组中
        int k=0;
        for(int s:set2){
            res[k++]=s;
        }
        return res;

    }
}

