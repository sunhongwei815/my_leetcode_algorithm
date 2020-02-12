package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午10:59
 * File Description：不同路径: 一个机器人位于一个 m x n 网格的左上角，试图达到网格的右下角
 *                              问总共有多少条不同的路径？
 *
 * 组合问题：C(m-1,m+n-2)
 * ！阶乘时可能数太大而导致越界->改成两个阶乘相除一起计算可以减小值
 */
public class demo062 {
    public int uniquePaths(int m, int n) {
        int k=Math.max(m,n),l=Math.min(m,n);
        //找出m,n较大的值和较小值，为下一步尽可能减少阶乘值的大小
        long result=faclong(m+n-2,k-1)/faclong(l-1,1);
        return (int)result;

    }
    //求两个阶乘相除(m!/n!)
    public long faclong(int m,int n){
        if(m==0 || n==0) return 1;
        long num=1;
        int p=m;
        while(p!=n){
            num*=(p--);
        }
        //  System.out.println("m: "+m+"n: "+n+" : "+num);
        return num;
    }
}
