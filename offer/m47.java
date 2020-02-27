package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午7:50
 * File Description：礼物的最大价值:在一个 m*n 的棋盘的每一格都放有一个礼物，
 *  每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，
 *  并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，
 *  请计算你最多能拿到多少价值的礼物？
 *
 *  动态规划：状态转移方程：dp[i][j]=max(dp[i-1][j],dp[i][j-1])+grid[i][j];
 *
 */
public class m47 {
    public int maxValue(int[][] grid) {
        for(int i=1;i<grid[0].length;i++){
            grid[0][i]+=grid[0][i-1];
        }
        for(int i=1;i<grid.length;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                grid[i][j]+=Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
