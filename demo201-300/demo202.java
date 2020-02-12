package demo201_300;

import java.util.HashSet;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:52
 * File Description：快乐数:一个“快乐数”定义为：对于一个正整数，每一次将该数替换为
 *                        它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
 *                        也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 *
 *
 *  hashset的方法，防止循环的现象发生，剩下的依次计算即可。
 */
public class demo202 {
    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(n);
        while(n!=1){
            n=PowerSum(n);
            if(set.contains(n)) return false;
            else set.add(n);
        }
        return true;
    }

    public static int PowerSum(int x){
        int sum=0;
        while(x!=0){
            sum+=(x%10)*(x%10);
            x/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
}