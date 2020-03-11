/**
 * @author:Sun Hongwei
 * @2020/3/12 上午1:34
 * File Description：所有排序代码的测试
 */
public class SortTest {
    public static void main(String[] args) {
        int[] array=new int[]{2,9,4,5,10,8,77,1,6};
        System.out.println("pre: ");
        for(int a:array){
            System.out.print(a+" ");
        }
        System.out.println(" ");

        //冒泡排序
        //System.out.print("Bubble Sort: ");
        //array=BubbleSort.bubbleSort(array);
        //快速排序
        //System.out.println("Quick Sort: ");
        //array=QuickSort.quickSort(array,0,array.length-1);
        //插入排序
        //System.out.println("Insert Sort: ");
        //array=InsertSort.insertSort(array);
        //希尔排序
        //System.out.println("Shell Sort: ");
        //array=ShellSort.shellSort(array);
        //归并排序
        //System.out.println("Merge Sort: ");
        //array=MergeSort.mergeSort(array);
        //桶排序
        System.out.println("Bucket Sort: ");
        array=BucketSort.bucketSort(array);




        for(int a:array){
            System.out.print(a+" ");
        }

    }
}
