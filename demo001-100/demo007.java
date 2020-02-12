package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午7:57
 * File Description：整数反转:给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 *
 * 设置个数组依次保存各位数字，再反过来加上
 */
public class demo007 {
    public static int reverse(int x){
        int flag=1,p=0;
        int[] out=new int[13];
        if(x<0){
            flag=-1;
        }
        x=Math.abs(x);
        while(x>0){
            out[p++]=x%10;
            x=x/10;
        }
        long result=0;
        for(int i=0;i<p;i++){
            result=result*10+out[i];
        }
        if(result>Math.pow(2,31)-1 || result<-Math.pow(2,31)){
            return 0;
        }
        return (int)result * flag;

    }

    public static void main(String[] args) {
        int x=1534236469;
        int result=reverse(x);
        System.out.println(result);
    }
}
