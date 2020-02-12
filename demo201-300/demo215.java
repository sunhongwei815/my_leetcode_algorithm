package demo201_300;

import java.util.PriorityQueue;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午4:01
 * File Description：数组中的第K个最大元素:在未排序的数组中找到第 k 个最大的元素。
 *                    需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 *
 *   PriorityQueue表示堆
 *   堆取数(堆顶即为最小值)和排序的时间复杂度都很低
 *
 */
public class demo215 {
    //数组中第k大的元素(创建堆)
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();

        //遍历数组放入堆中：
        for(int n:nums){
            p.add(n);
            if(p.size()>k){  //如果堆的容量大于k时
                p.poll();  //每次从堆顶移除最小值
            }
        }
        return p.poll();

    }

    public static void main(String args[]){
        int[] nums=new int[]{2,3,6,8,4,1};
        int k=2;
        int x=findKthLargest(nums,k);
        System.out.println(x);
    }
}
