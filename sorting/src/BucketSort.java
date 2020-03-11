import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/3/12 上午3:14
 * File Description：桶排序
 *
 */
public class BucketSort {
    public static int[] bucketSort(int[] array){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int a:array){
            max=Math.max(a,max);
            min=Math.min(a,min);
        }//找出数组中最大和最小值

        //创建桶
        int numBucket=(max-min)/array.length+1;
        ArrayList<ArrayList<Integer>> buckets=new ArrayList<>(numBucket);
        for(int i=0;i<numBucket;i++){
            buckets.add(new ArrayList<Integer>());
        }

        //把元素放进桶里
        for(int a:array){
            int num=(a-min)/array.length; //放进桶的序号
            buckets.get(num).add(a);
        }

        //对每个桶单独排序
        for(int i=0;i<buckets.size();i++){
            Collections.sort(buckets.get(i));
        }

        //把桶中的数按序取出
        int index=0;
        for(ArrayList<Integer> bucket:buckets){
            for(int a:bucket){
                array[index++]=a;
            }
        }
        return array;
    }
}
