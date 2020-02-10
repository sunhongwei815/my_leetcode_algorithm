import java.util.HashSet;
import java.util.Set;

/**
 * @author:Sun Hongwei
 * @2020/2/10 下午3:16
 * File Description：计数质数:统计所有小于非负整数 n 的质数的数量。
 * hash表：依次划去2，3，5，7，11。。。的倍数
 */
public class demo204 {
    public static int countPrimes(int n) {
        int count=0;
        int[] nums=new int[n];
        for(int i=2;i<Math.sqrt(n);i++){  //从2~根号n 遍历
            if(nums[i]!=1){     //依次只要把质数的倍数划去
                for(int j=i*2;j<n;j=j+i){
                    nums[j]=1;
                }
            }
        }
        for(int i=2;i<n;i++){
            count+=nums[i]==1?0:1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(2));
        System.out.println(countPrimes(25));
    }
}
