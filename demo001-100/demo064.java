package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/21 下午2:59
 * File Description：最小路径和: 给定一个包含非负整数的 m x n 网格，
 *            请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 *
 *   动态规划，除了边界：dp[i][j]=min（dp[i-1][j],dp[i][j-1]）+grid[i][j];
 *
 */
public class demo064 {
    public int minPathSum(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0){
                    continue;
                }else if(i==0){
                    grid[0][j]=grid[0][j-1]+grid[0][j];
                }else if(j==0){
                    grid[i][0]=grid[i-1][0]+grid[i][0];
                }else{
                    grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
