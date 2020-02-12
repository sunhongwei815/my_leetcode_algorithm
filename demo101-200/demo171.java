package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:01
 * File Description：Excel表列序号:给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 相当于26进制
 *
 */
public class demo171 {
    public static int titleToNumber(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            result=result*26+s.charAt(i)-'A'+1; //字符转换
        }
        return result;

    }

    public static void main(String[] args) {
        String x="A";
        int result=titleToNumber(x);
        System.out.println(result);
    }
}
