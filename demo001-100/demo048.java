package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午1:15
 * File Description：旋转图像:给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 *
 *
 * 1.先将矩阵转置  2.将每一行反转
 */
public class demo048 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp; // 交换设置的临时变量

        //矩阵转置
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //每一行前后交换
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }

    }
}
