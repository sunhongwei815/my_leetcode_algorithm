package demo401_500;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午10:18
 * File Description：汉明距离:两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *                   给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 *
 * 位运算：1.一个数和1进行&运算，可以判断末位是不是1
 *       2.异或计算（^）：如果两数在某位上不同，结果为1，否则为0
 */
public class demo461 {
    public static void main(String[] args) {
        int x=1534236469;
        int y=1099;
        int result=hammingDistance(x,y);
        System.out.println(result);
    }
    //汉明距离：位运算
    public static int hammingDistance(int x, int y) {
        int p=x^y;   //异或计算：如果两数在某位上不同，结果为1，否则为0
        int count=0;
        while(p!=0){
            if((p & 1)==1) { //和1进行与计算，判断末位是不是1
                count++;
            }
            p=p>>1; //向右移1位
        }
        return count;
    }
}
