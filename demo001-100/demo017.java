package demo001_100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午8:21
 * File Description：电话号码的字母组合:给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *  先用hashmap保存数字和字母的对应，再用回溯法遍历
 *
 **/
public class demo017 {

    Map<Character,String> phone=new HashMap<Character,String>(); //电话号码字母匹配表
    List<String> results=new ArrayList<String>();
    private String digits;

    public List<String> letterCombinations(String digits) {
        this.digits=digits;
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");

        if(digits.length()!=0){
            backtrack("",0);
        }
        return results;
    }
    public void backtrack(String temp,int num){ //当前字符串 num:该遍历第几个字符
        if(num==digits.length()){
            results.add(temp);
            return;
        }

        //Character c=digits.charAt(num);
        String letter=phone.get(digits.charAt(num));
        for(int i=0;i<letter.length();i++){
            backtrack(temp+letter.charAt(i),num+1);
        }
    }

}
