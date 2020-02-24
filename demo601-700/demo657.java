package demo601_700;

/**
 * @author:Sun Hongwei
 * @2020/2/24 下午4:34
 * File Description：机器人能否返回原点:
 *          在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，
 *          判断这个机器人在完成移动后是否在 (0, 0) 处结束。移动顺序由字符串表示。
 *          字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
 *          如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 *
 *
 *
 *RL用x表示， UD用y表示，最后统计x,y是否为0
 */
public class demo657 {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char move:moves.toCharArray()){
            if(move=='R'){
                x++;
            }else if(move=='L'){
                x--;
            }else if(move=='U'){
                y++;
            }else if(move=='D'){
                y--;
            }
        }
        if(x==0 && y==0) return true;
        else return false;

    }
}
