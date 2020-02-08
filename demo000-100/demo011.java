public class demo011 {
    //盛最多水的容器：双指针法
    public static int maxArea(int[] height) {
        int area=0,left=0,right=height.length-1;
        while(left<right){
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
