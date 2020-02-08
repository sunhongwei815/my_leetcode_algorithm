public class demo033 {
    public static int search(int[] nums, int target) {
        if(nums==null || nums.length==0) return -1;
        int l=0,r=nums.length-1,mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[l]<=nums[mid]){  //前半段有序
                if(nums[l]<=target && nums[mid]>target){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{  //前半段无序
                if(nums[r]>=target && nums[mid]<target){
                    l=mid+1;
                }else {
                    r=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,5,6,7,0,1,2};
        int x=3;
        int result=search(nums,x);
        System.out.println(result);
    }
}
