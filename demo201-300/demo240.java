package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午5:16
 * File Description：搜索二维矩阵II:编写一个高效的算法来搜索 mxn 矩阵matrix中的一个目标值target
 *      该矩阵具有以下特性：每行的元素从左到右升序排列。每列的元素从上到下升序排列。
 *
 *
 * 从左下角或者右上角开始一格格遍历,比如右上角开始，要么往下移1格（小于target），
 * 要么往左移1格(大于target)，这样总共最多移动m+n次
 */
public class demo240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int m=0,n=matrix[0].length-1; //开始在左上角
        while(m<matrix.length && n>=0){
            if(matrix[m][n]==target){
                return true;
            }else if(matrix[m][n]>target){  //大于target，往左移1格
                n--;
            }else{   //小于target，往下移1格
                m++;
            }
        }
        return false;
    }
}
