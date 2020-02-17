package demo101_200;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author:Sun Hongwei
 * @2020/2/17 下午1:37
 * File Description：最大数:给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 *
 *
 * 排序：按照ab和ba的值大小进行比较
 */
public class demo179 {

    //重新定义比较函数
    private class largerComparator implements Comparator<String> {
        @Override
        public int compare(String a,String b){
            String s1=a+b;
            String s2=b+a;
            return s2.compareTo(s1);
            //String.compareTo: a.compareTo(b):若a大则返回正值，否则返回负值
        }
    }

    public String largestNumber(int[] nums) {
        String[] numString=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            numString[i]=String.valueOf(nums[i]);
        }

        //排序
        Arrays.sort(numString,new largerComparator());

        if(numString[0].equals("0")) return "0";
        String largestNumberString=new String();
        for(String str:numString){
            largestNumberString+=str;
        }
        return largestNumberString;


    }
}
