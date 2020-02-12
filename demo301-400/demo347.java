package demo301_400;

import java.util.*;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午8:36
 * File Description：前 K 个高频元素:给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 用一个hashmap统计个数
 * 并建立一个PriorityQueue用堆来筛选前k个元素
 */
public class demo347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>(); //存储个数
        for(int n:nums){
            //map.getOrDefault(x1,x2):默认取x1的值，若为空取x2
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> heap=new PriorityQueue<Integer>
                ((n1,n2) ->map.get(n1)-map.get(n2)); //按照value值从小到大建堆

        for(int n:map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        List<Integer> ktop=new ArrayList<Integer>();
        while (!heap.isEmpty()){
            ktop.add(heap.poll()); //把堆中元素防止arraylist中
        }
        Collections.reverse(ktop); //数组翻转
        return ktop;
    }
}
