import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/9 下午11:57
 * File Description：杨辉三角:给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * 动态规划
 */
public class demo118 {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle=new ArrayList<List<Integer>>();
            if(numRows==0) return triangle;

            //第一行
            triangle.add(new ArrayList<>());
            triangle.get(0).add(1);

            //下面开始动态规划：
            for(int i=1;i<numRows;i++){
                List<Integer> row=new ArrayList<Integer>();
                List<Integer> previous=triangle.get(i-1); //前一行

                row.add(1); //每行第一个
                for(int j=1;j<i;j++){
                    row.add(previous.get(j-1)+previous.get(j));
                }
                row.add(1); //每行最后一个
                triangle.add(row);
            }
            return triangle;
        }
}
