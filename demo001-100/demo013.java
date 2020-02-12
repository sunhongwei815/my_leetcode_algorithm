package demo001_100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午10:11
 * File Description：罗马数字转整数:罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *通常情况下，罗马数字中小的数字在大的数字的右边。
 * 特例：I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * 给定一个罗马数字，将其转换成整数。
 *
 *
 *
 *方法：先用hashmap保存各字母表示值的大小，然后判断I,X,C的位置判断应该是加还是减
 */
public class demo013 {
    public static int romanToInt(String s) {
        int result=0;
        char in[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length();i++){
            if(in[i]=='V' || in[i]=='L' || in[i]=='D'|| in[i]=='M'){
                result+=(int)map.get(in[i]);
            }else if(in[i]=='I'){
                if(i<s.length()-1 && (in[i+1]=='V' || in[i+1]=='X')){
                    result-=(int)map.get(in[i]);
                }else{
                    result+=(int)map.get(in[i]);
                }
            }else if(in[i]=='X'){
                if(i<s.length()-1 && (in[i+1]=='L' || in[i+1]=='C')){
                    result-=(int)map.get(in[i]);
                }else{
                    result+=(int)map.get(in[i]);
                }
            }else if(in[i]=='C'){
                if(i<s.length()-1 && (in[i+1]=='D' || in[i+1]=='M')){
                    result-=(int)map.get(in[i]);
                }else{
                    result+=(int)map.get(in[i]);
                }
            }
        }
        return result;
    }
}
