package demo001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午4:14
 * File Description：螺旋矩阵:给定一个包含 m x n 个元素的矩阵（m 行, n 列），
 *                  请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 *   按照右->下->左->上的顺序一层层遍历
 */
public class demo054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<Integer>();
        if(matrix==null || matrix.length==0){
            return ans;
        }
        int m=matrix.length,n=matrix[0].length;
        int layer=(Math.min(m,n)+1)/2; //矩阵的圈数
        int i=0,j;
        while(i<layer){
            for(j=i;j<n-i;j++){  //右
                ans.add(matrix[i][j]);
            }
            for(j=i+1;j<m-i;j++){  //下
                ans.add(matrix[j][n-i-1]);
            }
            for(j=(n-1)-(i+1);j>=i && (m-1-i)!=i;j--){  //左
                ans.add(matrix[m-1-i][j]);   //m-1-i!=i为了防止n>m的情况，此时横向不需要再遍历
            }
            for(j=(m-1)-(i+1);j>=i+1 && (n-1-i)!=i;j--){ //上
                ans.add(matrix[j][i]);   //n-1-i!=i 情况同上所述
            }
            i++;
        }
        return ans;

    }

}
