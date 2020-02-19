package demo001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午10:51
 * File Description：格雷编码： 格雷编码是一个二进制数字系统，在该系统中，
 *                             两个连续的数值仅有一个位数的差异。
 *                            给定一个代表编码总位数的非负整数 n，打印其格雷编码序列。
 *                             格雷编码序列必须以 0 开头。
 *
 *镜像法：先统计完k位的所有编码后，将前面最高位填1，将所有数反过来遍历一遍，加起来即为k+1位的编码
 */
public class demo089 {
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<Integer>();
        result.add(0);
        int head=1;
        for(int i=0;i<n;i++){
            for (int j=result.size()-1;j>=0;j--){
                result.add(head+result.get(j));
            }
            head=head<<1;
        }
        return result;
    }
}
