/**
 * @author:Sun Hongwei
 * @2020/2/10 下午3:33
 * File Description： 合并两个有序数组:给定两个有序整数数组nums1和nums2,
 *                                 将nums2合并到nums1中，使得num1成为一个有序数组。
 *  （1） 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 *  （2） 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 *   解决办法：双指针从后往前遍历：时间O(m+n) 空间O(1)
 */
public class demo088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1,p2=n-1,loc=m+n-1;  //loc:最后result的长度
        while (p1>=0 && p2>=0) {
            if(nums1[p1]>nums2[p2]){
                nums1[loc--]=nums1[p1];
                p1--;
            }else{
                nums1[loc--]=nums2[p2];
                p2--;
            }
        }
        if(p2>=0){  //如果nums2前面还有剩余，全部移至nums1里面相同位置
            for(int i=0;i<=p2;i++){
                nums1[i]=nums2[i];
            }
        }
    }
}
