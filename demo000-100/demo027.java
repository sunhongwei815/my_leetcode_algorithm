public class demo027 {
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[j]==val){
               j--;
            }else {
                if (nums[i] == val) {
                    nums[i] = nums[j];
                    j--;
                }
                i++;
            }
        }
        for(int a:nums)
            System.out.print(a+" ");
        System.out.println(" ");
        System.out.println("i: "+i+" j:"+j);
        return i;
    }
    public static void main(String[] args) {
        int result=0;
        int num[]=new int[]{0,1,2,2,3,0,4,2};
        int var=2;
        result=removeElement(num,var);
        System.out.println(result);
    }


}
