/**
 * @author:Sun Hongwei
 * @2020/2/9 下午8:34
 * File Description：输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）
 * 位1的个数：利用数的位运算
 */
public class demo191 {
    public static int hammingWeight(int n) {
        int bits=0;
        while(n>0){
            if((n & 1)!=0){ //和1进行&运算，如果不是0，说明尾数（个位数）是1
                bits++;
            }
            n=n>>>1; //右移一位(>>>:无符号数右移，负数高位补0，>>：负数高位补1)
        }
        return bits;
    }
    public static void main(String[] args) {
        int n = 00000000000000000000000010000000;
        System.out.println(hammingWeight(n));
    }


}
