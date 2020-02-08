public class demo053 {
    //最大自序和：动态规划
    public static int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=(nums[i-1]>0)?nums[i-1]:0;
            maxsum=(nums[i]>maxsum)?nums[i]:maxsum;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-2,-1};
        int x=maxSubArray(nums);
        System.out.println(x);
    }
}
