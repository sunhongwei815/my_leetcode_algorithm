package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 下午6:27
 * File Description：把数字翻译成字符串:给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，
 * 1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 *
 *
 *动态规划：若第i位和第i-1位组成的数字小于26且大于等于10，那么dp[i]=dp[i-1]+dp[i-2]
 *        否则dp[i]=dp[i-1]
 */
public class m46 {
    public int translateNum(int num) {
        char[] numc=String.valueOf(num).toCharArray();
        int[] dp=new int[numc.length];
        if(numc.length==1) return 1;
        //确定动态转移方程前两位
        dp[0]=1;
        if((numc[0]-'0')*10+numc[1]-'0'<26){
            dp[1]=2;
        }else{
            dp[1]=1;
        }
        for(int i=2;i<numc.length;i++){
            int temp=(numc[i-1]-'0')*10+numc[i]-'0';
            if(temp<26 && temp>=10){  //某一位是0的情况也需要考虑
                dp[i]=dp[i-1]+dp[i-2];
            }else{
                dp[i]=dp[i-1];
            }
        }
        return dp[numc.length-1];
    }
}
