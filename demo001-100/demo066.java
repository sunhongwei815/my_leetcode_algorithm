/**
 * @author:Sun Hongwei
 * @2020/2/9 下午10:04
 * File Description：给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *                   最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *   (防止1种特殊情况9999总位数会改变，其他从后往前考虑进位的情况即可)
 */
public class demo066 {
    public static int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            digits[i]++;
            if(digits[i]!=10){
                return digits;
            }else{
                digits[i]=0;
            }
        }
        digits=new int[len+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        int[] tt=plusOne(nums);
        for(int i:tt){
            System.out.println(i);
        }


    }


}
