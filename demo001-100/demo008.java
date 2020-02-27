package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午12:25
 * File Description：字符串转换整数 (atoi):实现一个 atoi 函数，使其能将字符串转换成整数。
 *首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，
 * 作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略,它们对于函数不应该造成影响。
 *
 *
 * 完全靠耐心排除一个个特殊情况即可
 */
public class demo008 {
    public int myAtoi(String str) {
        int zf=1; //正负号
        int result=0; //最终返回结果
        int i;
        for(i=0;i<str.length();i++){  //先处理开头的各种情况
            if(str.charAt(i)==' '){
                continue;
            }else{
                if(str.charAt(i)=='+'){
                    i++;
                    break;
                }else if(str.charAt(i)=='-'){
                    zf=-1;
                    i++;
                    break;
                }else if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                    return 0;
                }else{
                    break;
                }
            }
        }
        if(i==str.length()){ //如果已经遍历完数组
            return 0;
        }
        for(;i<str.length();i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                return 0;
            }
            int p=(str.charAt(i)-'0')*zf;
            //提前判断加上后是否会越界
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE / 10 && p>Integer.MAX_VALUE%10)){
                return Integer.MAX_VALUE;
            }
            if(result<Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE / 10 && p<Integer.MIN_VALUE%10)){
                return Integer.MIN_VALUE;
            }
            result=result*10+p;
        }
        return result;
    }

}
