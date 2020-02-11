import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/11 下午6:27
 * File Description：Fizz Buzz
 *
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 *
 */
public class demo412 {
    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<>(n);
        for(int x=1;x<=n;x++){
            if(x%3==0 && x%5==0){
                res.add("FizzBuzz");
            }else if(x%3==0){
                res.add("Fizz");
            }else if(x%5==0){
                res.add("Buzz");
            }else{
                res.add(Integer.toString(x));
            }
        }
        return res;

    }
}
