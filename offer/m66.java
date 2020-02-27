package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午1:17
 * File Description：构建乘积数组: 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
 * 其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 *
 * 将每个最终答案分成left*right两部分来看，分别从左和从右遍历两遍计算即可
 *
 */
public class m66 {
    public int[] constructArr(int[] a) {
        int[] result=new int[a.length];
        int left=1,right=1;
        //求left
        for(int i=0;i<a.length;i++){
            result[i]=left;
            left*=a[i];
        }
        //求right
        for(int i=a.length-1;i>=0;i--){
            result[i]*=right;
            right*=a[i];
        }
        return result;
    }
}
