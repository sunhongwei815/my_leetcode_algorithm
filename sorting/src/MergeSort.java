/**
 * @author:Sun Hongwei
 * @2020/3/12 上午2:36
 * File Description：归并排序
 */
public class MergeSort {
    public static int[] mergeSort(int[] array){
        sort(array,0,array.length-1);
        return array;
    }

    public static void sort(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        //找出中间索引
        int mid=(left+right)/2;
        //对左边递归
        sort(array,left,mid);
        //对右边递归
        sort(array,mid+1,right);
        //把两边合并
        merge(array,left,right,mid);
    }

    //合并左右两边数组
    public static void merge(int[] array,int left,int right,int middle){
        int[] temp=new int[array.length];
        int left_index=left; //左边子数组索引
        int right_index=middle+1; //右边子数组索引
        int index=left;  //合并时总索引
        while(left_index<=middle && right_index<=right){
            //依次比较两数组大小
            if(array[left_index]<array[right_index]){
                temp[index++]=array[left_index++];
            }else{
                temp[index++]=array[right_index++];
            }
        }
        //剩余的数放入(执行其中一段)
        while(left_index<=middle){
            temp[index++]=array[left_index++];
        }
        while(right_index<=right){
            temp[index++]=array[right_index++];
        }

        //放回原数组
        while(left<=right){
            array[left]=temp[left];
            left++;
        }
    }
}
