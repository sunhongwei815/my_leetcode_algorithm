package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午4:39
 * File Description：解码方法:一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *         'A' -> 1
 *         'B' -> 2
 *           ...
 *         'Z' -> 26
 *    给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 *
 *
 * 动态规划：设第i位和第i-1位组成的数var
 *   (一)若s[i]==0:
 *       (1) var<26:dp[i]=dp[i-2]
 *       (2) var==0 :结果为0
 *       (3) var>0 : 结果为0
 *   (二）若s[i]!=0:
 *        (1)  var>26 或 var<10: dp[i]=dp[i-1] : 第i位只能单独编码
 *        (2)  10<var<=26: dp[i]=dp[i-1]+dp[i-2]
 *
 *
 */
public class demo091 {
    public int numDecodings(String s) {
        if(s.length()==0 ) return 0;
        if(s.charAt(0)=='0') return 0;
        if(s.length()==1) return 1;

        int[] dp=new int[s.length()]; //dp:状态转移方程
        char past=s.charAt(0),current=s.charAt(1);  //第i-1个字符和第i个字符
        dp[0]=1;
        //根据前两位确定dp[0],dp[1]
        int sum=(past-'0')*10+(current-'0');
        if(current=='0'){
            if(sum<26){
                dp[1]=1;
            }else{
                return 0;
            }
        }else{
            if(sum<=26){
                dp[1]=2;
            }else{
                dp[1]=1;
            }
        }
        //length超过两位，从后面开始分类用状态转移方程
        for(int i=2;i<s.length();i++){
            past=s.charAt(i-1);
            current=s.charAt(i);
            if(current=='0'){
                if(past=='0'){
                    return 0;
                }else if(past=='1' || past=='2'){
                    dp[i]=dp[i-2];
                }
            }else{  //s[i]!=0
                if(past=='0' || (past-'0')*10+(current-'0')>26){
                    dp[i]=dp[i-1];
                }else{
                    dp[i]=dp[i-1]+dp[i-2];
                }
            }

        }
        return dp[s.length()-1];
    }
}
