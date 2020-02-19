package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午1:38
 * File Description：外观数列:「外观数列」是一个整数序列，从数字 1 开始，
 *                              序列中的每一项都是对前一项的描述。
 *例如：
 *  1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *  给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 *
 *
 *
 * 用StringBuilder方便操作，循环整个过程即可
 */
public class demo038 {
    public String countAndSay(int n) {
        StringBuilder ans=new StringBuilder();
        ans.append("1");

        for(int i=2;i<=n;i++){
            StringBuilder current=new StringBuilder(ans);

            ans.delete(0,ans.length());
            char last=current.charAt(0);
            int count=0;
            for(int j=0;j<current.length();j++){
                if(current.charAt(j)==last){
                    count++;
                }else{
                    ans.append((char)('0'+count));
                    ans.append(last);
                    last=current.charAt(j);
                    count=1;
                }
            }
            //最后一个数字
            ans.append((char)('0'+count));
            ans.append(last);
        }
        return  ans.toString();


    }
}
