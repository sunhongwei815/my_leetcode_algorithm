package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午1:30
 * File Description：单词搜索:给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 *
 *   单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 *   其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 *
 * 回溯法遍历
 */
public class demo079 {
    private char[][] board;
    private String word;
    private int rows; //行数
    private int cols; //列数

    private boolean[][] marked;  //表明是否在回溯中被标记
    private int[][] direction={{0,1},{0,-1},{1,0},{-1,0}}; //运动的方向

    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.word=word;
        rows=board.length;
        cols=board[0].length;
        marked=new boolean[rows][cols];
        //回溯的入口
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean inAera(int x,int y){
        if(x<0 || x>=rows) return false;
        if(y<0 || y>=cols) return false;
        return true;
    }

    private boolean dfs(int m,int n,int start){
        if(start==word.length()-1){
            return board[m][n]==word.charAt(start);
        }

        if(board[m][n]==word.charAt(start)) {
            marked[m][n] = true;
            //寻找下一步
            for (int i = 0; i < 4; i++) {
                int newX = m + direction[i][0];
                int newY = n + direction[i][1];
                if (inAera(newX, newY) && !marked[newX][newY]) {
                    if (dfs(newX, newY, start + 1)) {
                        return true;
                    }
                }
            }
            //回溯
            marked[m][n] = false;
        }
        return false;
    }
}
