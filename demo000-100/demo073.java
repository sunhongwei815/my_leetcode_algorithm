package demo001_100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午9:17
 * File Description：矩阵置零:给定一个 m x n 的矩阵，如果一个元素为 0，
 *                         则将其所在行和列的所有元素都设为 0。
 *
 *
 *  用两个hashset分别保存要置0的行号和列号
 */
public class demo073 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> col=new HashSet<Integer>(); //列号
        Set<Integer> row=new HashSet<Integer>(); //行号

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        //置零
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }



    }
}
