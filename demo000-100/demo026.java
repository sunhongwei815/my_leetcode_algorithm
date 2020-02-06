import java.util.Arrays;

public class demo026 {
    public static void main(String[] args) {
        int result=0;
        int num[]=new int[]{2,3,3,4,5,5,7};
        result=removeDuplicates(num);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int i=0,j=1;
        if(nums.length<=1){
            return nums.length;
        }else{
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    j++;
                }else{
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
            }
        }
        return i+1;
    }
}
