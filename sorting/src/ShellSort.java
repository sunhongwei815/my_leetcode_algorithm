/**
 * @author:Sun Hongwei
 * @2020/3/12 上午2:15
 * File Description：希尔排序
 */
public class ShellSort {
    public static int[] shellSort(int[] array){
        int dk=array.length/3+1;  //dk: 每次比较的步长
        while (dk>=1){
            shellInsertSort(array,dk);
            if(dk==1){
                break;
            }
            dk=dk/3+1;
        }
        return array;
    }

    private static void shellInsertSort(int[] array,int dk){
         //每次步长为dk的插入排序
        for(int i=dk;i<array.length;i++){
            if(array[i]<array[i-dk]){
                int j;
                int num=array[i]; //要插入的地方
                for(j=i-dk; j>=0 && num<array[j];j=j-dk){
                    //步长为dk,逐个往前比较，找到要插入的地方
                    array[j+dk]=array[j];
                }
                array[j+dk]=num; //需要插入的位置


            }
        }
    }
}
