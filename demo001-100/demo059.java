package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午5:51
 * File Description：螺旋矩阵 II:给定一个正整数 n，生成一个包含 1 到 n2 所有元素，
 *                            且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 同054题相似，按顺序右->下->左->上逐层从外往内遍历
 */
public class demo059 {
    public static int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int level=n/2+1,k=0;  //level层数
        int num=1;
        while(k<level && num<=n*n){
            for(int i=k;i<n-k && num<=n*n;i++){
                mat[k][i]=num++;
            }
            for(int i=k+1;i<n-k && num<=n*n;i++){
                mat[i][n-1-k]=num++;
            }
            for(int i=(n-1)-(k+1);i>=k && num<=n*n;i--){
                mat[n-1-k][i]=num++;
            }
            for(int i=(n-1)-(k+1);i>k && num<=n*n;i--){
                mat[i][k]=num++;
            }
            k++;
        }
        return mat;
    }

    public static void main(String[] args) {
        int n=6;
        int[][] mat=generateMatrix(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
