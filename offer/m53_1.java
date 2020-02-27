package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午1:34
 * File Description：在排序数组中查找数字 I: 统计一个数字在排序数组中出现的次数.
 *
 *
 *
 * 二分查找！！
 */
public class m53_1 {
    private int target;
    private int[] nums;
    public int search(int[] nums, int target) {
        this.nums=nums;
        this.target=target;
        if(nums.length==0) return 0;

        int left=binarySearch(true);
        int right=binarySearch(false);
        if(left==-1){
            return 0;
        }else{
            return right-left+1;
        }

    }

    public int binarySearch(boolean flag){ //flag==true:寻找左边界
        int left=0,right=nums.length-1,mid;
        while (left<right){
            mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target && flag==true){ //寻找左边界时相等
                right=mid;
            }else if(nums[mid]==target && flag==false){ //寻找右边界时相等
                if(nums[mid+1]==target){  //此时mid+1是否还等于target
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
        }
        if(nums[left]!=target) return -1; //不存在此值，返回-1
        return left;

    }
}
