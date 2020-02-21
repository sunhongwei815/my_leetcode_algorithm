package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/21 下午1:17
 * File Description：岛屿数量:  给定一个由'1'(陆地)和'0'(水)组成的的二维网格，计算岛屿的数量。
 *                       一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
 *
 *
 * 深度优先遍历DFS
 */
public class demo200 {
    private char[][] grid;
    public int numIslands(char[][] grid) {
        this.grid=grid;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j);
                    count++;
                }

            }
        }
        return count;
    }

    private void dfs(int i,int j){  //DFS
        //超出边界返回
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length ) return;
        if(grid[i][j]=='0') return;
        grid[i][j]='0';
        dfs(i-1,j);
        dfs(i+1,j);
        dfs(i,j-1);
        dfs(i,j+1);
    }
}
