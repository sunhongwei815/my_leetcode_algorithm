package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/13 上午1:45
 * File Description：Nim 游戏:你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，
 *          每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
 *          编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
 *
 *
 *每个回合两人之和可以始终为4的倍数（1/3,2/2,3/1),所以只要不是4的倍数，自己就可以摸完后变成后手
 */
public class demo292 {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}
