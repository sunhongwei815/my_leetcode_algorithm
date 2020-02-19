package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午10:09
 * File Description：最长回文子串:给定一个字符串 s，找到 s 中最长的回文子串。
 *
 *
 * 动态规划： dp[i][j]=dp[i+1][j-1] && s[i]==s[j]
 */
public class demo005 {
    public String longestPalindrome(String s) {
        String result="";
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if ((j-i<2) || dp[i+1][j-1]==true) { //状态转移方程
                        dp[i][j]=true;
                        if(j-i+1>result.length()){
                            result=s.substring(i,j+1);
                        }
                    }
                }
            }
        }
        return result;
    }
}
