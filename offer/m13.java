package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午9:53
 * File Description：机器人的运动范围:地上有一个m行n列的方格，从坐标[0,0]到坐标[m-1,n-1]。
 *   一个机器人从坐标[0, 0]的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。
 *
 *
 * 深度优先遍历DFS
 */
public class m13 {
    private int m,n,k,count=0;
    private boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        this.visited=new boolean[m][n]; //访问标志位
        this.m=m;
        this.k=k;
        this.n=n;
        dfs(0,0);
        return count;
    }
    public void dfs(int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || visited[i][j]==true){
            return;
        }//遇到边界

        if((i%10+i/10)+(j%10+j/10)>k){
            return;  //数位之和超过预定值
        }
        visited[i][j]=true;
        count++;

        //遍历下一格
        dfs(i-1,j);
        dfs(i+1,j);
        dfs(i,j-1);
        dfs(i,j+1);
    }
}
