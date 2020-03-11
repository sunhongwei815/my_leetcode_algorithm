/**
 * @author:Sun Hongwei
 * @2020/3/12 上午2:00
 * File Description：插入排序
 *
 */
public class InsertSort {
    public static int[] insertSort(int[] array){
        for(int i=1;i<array.length;i++){
            int num=array[i]; //要被插入的数
            int index=i-1; //被插入的位置
            while(index>=0 && num<array[index]){
                //从后向前遍历，如果想插入的数比当前数组该位置的数值要小，则把当前数组向后移
                array[index+1]=array[index];
                index--;
            }
            //将插入的数放入合适的位置
            array[index+1]=num;
        }
        return array;
    }
}
