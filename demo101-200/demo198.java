public class demo198 {
    //rob:动态规划
    public static int rob(int[] nums){
        if(nums.length<1) return 0;
        if(nums.length==1) return nums[0];
        int[] maxsum=new int[nums.length];
        maxsum[0]=nums[0];
        maxsum[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            maxsum[i]=Math.max(maxsum[i-1],maxsum[i-2]+nums[i]);
        }
        return maxsum[nums.length-1];
    }

    public static void main(String[] args) {
        int[] n=new int[]{2,1,1,2};

        System.out.println(rob(n));
    }
}
