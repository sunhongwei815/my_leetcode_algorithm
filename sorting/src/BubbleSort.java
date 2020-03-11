/**
 * @author:Sun Hongwei
 * @2020/3/12 上午1:28
 * File Description：冒泡排序
 *
 *
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        //外层循环:排序的趟数
        for(int i=0;i<array.length;i++){
            //内存循环：数组中从前往后遍历逐个比较大小，大的往后继续比较
            //第k次只需要比较前n-k个数即可，后k-1个数已排好序
            for(int j=0;j<array.length-i-1;j++){
                //把较大的数往后排
                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
