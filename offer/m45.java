package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/28 下午3:56
 * File Description：把数组排成最小的数: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 *                   打印能拼接出的所有数字中最小的一个。
 *
 *  本质上就是排序题，根据字符串a+b和b+a的大小来排序
 *  这里用到了sort函数里套用compareTo
 *
 */
public class m45 {
    public String minNumber(int[] nums) {
        List<String> str=new ArrayList<String>();
        //转换为String数组
        for(int n:nums){
            str.add(String.valueOf(n));
        }
        str.sort((s1,s2)->(s1+s2).compareTo(s2+s1));
        StringBuilder stringBuilder=new StringBuilder();
        for(String s:str){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
