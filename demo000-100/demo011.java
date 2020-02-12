package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午8:12
 * File Description：盛最多水的容器: 给定 n 个非负整数 a1，a2，...，an，
 *                 每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，
 *                  垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，
 *                  使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 *
 *  设置两个指针，一前一后遍历
 *
 */
public class demo011 {
    //盛最多水的容器：双指针法
    public static int maxArea(int[] height) {
        int area=0,left=0,right=height.length-1;
        while(left<right){
            //遍历过程中的更新
            area=Math.max(area,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }

    public static void main(String args[]){
        int[] height=new int[]{1,8,6,2,5,4,8,3,7};
        int result=maxArea(height);
        System.out.println(result);
    }
}
