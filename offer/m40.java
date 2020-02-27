package offer;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午2:29
 * File Description：最小的k个数:输入整数数组 arr ，找出其中最小的 k 个数。
 *        例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *
 * Java中PirorityQueue以堆为基础
 */
public class m40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0) return new int[0];
        Queue<Integer> q=new PriorityQueue<Integer>((a,b)->b-a);
        for(int a:arr){
            if(q.size()<k){
                q.add(a);
            }else if(q.peek()>a){
                q.remove();
                q.add(a);
            }
        }

        int[] result=new int[k];
        int num=0;
        while(q.size()>0){
            result[num++]=q.remove();
        }
        return result;

    }
}
