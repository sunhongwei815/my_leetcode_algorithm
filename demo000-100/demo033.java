package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午2:54
 * File Description：搜索旋转排序数组:假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *               搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *               你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 方法：二分查找：比普通的二分查找多考虑前后半段是否有序的问题
 */
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

