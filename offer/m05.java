package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午12:11
 * File Description：替换空格：请实现一个函数，把字符串 s 中的每个空格替换成"%20"
 *
 * Java中直接用StringBuilder.append()解决
 */
public class m05 {
    public String replaceSpace(String s) {
        StringBuilder ss=new StringBuilder();
        for(Character c:s.toCharArray()){
            if(c==' ') ss.append("%20");
            else ss.append(c);
        }
        return ss.toString();
    }
}
