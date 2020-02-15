package demo301_400;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author:Sun Hongwei
 * @2020/2/15 下午1:17
 * File Description：有序矩阵中第K小的元素: 给定一个 n x n 矩阵，
 *                      其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。
 *
 * 用优先队列PriorityQueue实现最大堆（容量为k)，最后返回堆顶值。
 */
public class demo378{
    public int kthSmallest(int[][] matrix, int k) {
         PriorityQueue<Integer> p=new PriorityQueue<Integer>(new Comparator<Integer>() {
             @Override
             public int compare(Integer p1, Integer p2) {
                 return p2-p1;     //最大堆
             }
         });
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 p.add(matrix[i][j]);
                 if(p.size()>k) p.poll(); //当堆元素超过k个元素，去掉当前最大值
             }
         }
         return p.poll();
    }
}
