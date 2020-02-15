package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/15 下午1:51
 * File Description：颜色分类(荷兰三色旗问题):给定一个包含红色、白色和蓝色，
 *                       一共 n 个元素的数组，原地对它们进行排序，
 *                      使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 *
 *  设置两个指针p1,p2一前一后分别统计0，2的位置，再设置一个遍历数组的指针p
 *
 */
public class demo075 {
    public void sortColors(int[] nums) {
        int p1=0,p2=nums.length-1,p=0;//p1:0的位置，p2:2的位置
        while(p<=p2){
            if(nums[p]==2){
                trans(p,p2,nums);
                p2--;
            }else if(nums[p]==0){
                trans(p,p1,nums);
                p1++;
                p++;      //数组前面的数全部已经遍历过了，所以不用考虑数组前的情况
            }
            else p++;
        }
    }

    public void trans(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
