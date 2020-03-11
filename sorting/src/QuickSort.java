/**
 * @author:Sun Hongwei
 * @2020/3/12 上午1:37
 * File Description：快速排序
 *
 */
public class QuickSort {
    public static int[] quickSort(int[] array,int low,int high){
        int left=low; //从前往后比较的索引
        int right=high;  //从后往前的索引
        int key=array[low]; //基准值

        while (left<right){
            while(left<right && array[right]>key){
                right--; //从后往前遍历，与基准值比较，如果比基准值大则放在原地不管
                         //主要任务：找到比基准值小的数都移到前面
            }
            if(array[right]<key){
                //遇到比基准值小的数，和左指针交换
                int temp=array[right];
                array[right]=array[left];
                array[left]=temp;
            }
            //从前往后遍历，与基准值比较，如果比基准值小则原地不管，继续向后遍历
            while (left<right && array[left]<key){
                left++;
            }
            //遇到比基准大的数，和右指针交换
            if(array[left]>key){
                int temp=array[right];
                array[right]=array[left];
                array[left]=temp;
            }
        } //一次循环结束，此时左边的数都比key小，右边的数都比key大

        //左半部分内部排序
        if(left>low){
            quickSort(array,low,left-1);
        }
        //右半部分内部排序
        if(right<high){
            quickSort(array,right+1,high);
        }
        return array;
    }
}
