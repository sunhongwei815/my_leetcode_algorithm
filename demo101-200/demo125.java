/**
 * @author:Sun Hongwei
 * @2020/2/9 下午10:28
 * File Description：验证回文串:给定一个字符串，验证它是否是回文串，
 *                            只考虑字母和数字字符，可以忽略字母的大小写。
 *     双指针：一个从前往后，一个从后往前
 */
public class demo125 {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while (l<r){
            //注意内部也需要保证l<r
            while (l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }else{
                l++;r--;
            }
        }
        return true;
    }
}
