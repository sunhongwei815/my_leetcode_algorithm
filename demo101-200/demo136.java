import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class demo136 {
    public static int singleNumber(int[] nums) {
        HashSet set=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                set.remove(nums[i]);
            }
        }
        return (int)set.iterator().next();
    }

    public static void main(String[] args) {
        int[] x=new int[]{4,1,2,1,2,3,4,6,7,6,7};
        int result=singleNumber(x);
        System.out.println(result);
    }
}
