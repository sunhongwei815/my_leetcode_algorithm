package demo001_100;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author:Sun Hongwei
 * @2020/2/17 下午12:20
 * File Description：有效的数独:判断一个 9x9 的数独是否有效。只需要根据以下规则：
 *           1.数字 1-9 在每一行只能出现一次。
 *           2.数字 1-9 在每一列只能出现一次。
 *           3.数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 *
 *
 * 三种hashset统计,遍历一遍即可
 */
public class demo036 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows=new HashSet[9];
        HashSet<Integer>[] lines=new HashSet[9];
        HashSet<Integer>[] blocks=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<Integer>();
            lines[i]=new HashSet<Integer>();
            blocks[i]=new HashSet<Integer>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int n=board[i][j]-'0';
                int block_index=(i/3)*3+(j/3);
                //行
                if(rows[i].contains(n)){
                    return false;
                }else{
                    rows[i].add(n);
                }
                //列
                if(lines[j].contains(n)){
                    return false;
                }else{
                    lines[j].add(n);
                }
                //小格
                if(blocks[block_index].contains(n)){
                    return false;
                }else{
                    blocks[block_index].add(n);
                }
            }
        }
        return true;

    }
}
