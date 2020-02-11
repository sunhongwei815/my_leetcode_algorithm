import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/11 下午7:47
 * File Description：杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * 同之前一题的杨辉三角，设置两个变量previous和current分别表示上行和当前行，动态规划每行即可
 */
public class demo119 {
    public static List<Integer> getRow(int rowIndex) {
        //注意Arraylist不能直接copy，必须新开个空间
        List<Integer> previous=new ArrayList<Integer>(); //前一行
        previous.add(1);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> current=new ArrayList<Integer>();  //当前行
            current.add(1);
            for(int j=1;j<i;j++){
                if(previous.size()>j) {
                    current.add(previous.get(j) + previous.get(j - 1));
                }
            }
            current.add(1);
            previous=current;  //previous指向current的空间
        }
        return previous;
    }

    public static void main(String[] args) {
        int num=3;
        List<Integer> list=new ArrayList<Integer>();
        list=getRow(num);

    }

}
