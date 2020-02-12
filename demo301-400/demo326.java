package demo301_400;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:36
 * File Description：3的幂: 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 *  循环迭代除3知道结果是1即可，中间过程不能被3整除返回false
 */
public class demo326 {
    public static boolean isPowerOfThree(int n) {
        if(n<1) return false;
        while(n>1){
            if(n%3!=0){
                return false;
            }
            n/=3;
        }
        return true;
    }

    public static void main(String[] args) {
        int x=27;
        boolean result=isPowerOfThree(x);
        System.out.println(result);
    }
}
