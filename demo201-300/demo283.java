package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午4:12
 * File Description：移动零:给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
 *                         同时保持非零元素的相对顺序。
 *
 * 设置两个指针，一前一后，不断将后面非0的数和前面的0进行交换即可
 */
public class demo283 {
    public static void moveZeroes(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[j]==0){
                j++;
            }else {
                if (nums[i]==0) {
                    nums[i]=nums[j];
                    nums[j]=0;
                    j++;
                }
                i++;
                if(i>=j){
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int result=0;
        int num[]=new int[]{0,1,0,3,12};
        moveZeroes(num);
    }
}

