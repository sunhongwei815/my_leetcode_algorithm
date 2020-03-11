/**
 * @author:Sun Hongwei
 * @2020/3/12 上午1:23
 * File Description：二分查找
 */
public class BinarySearch {
    public static int binarySearch(int[] array,int num){
        int l=0,r=array.length-1,mid;
        while(l<=r){
            mid=(l+r)/2;
            if(array[mid] == num){
                return mid;
            }else if(array[mid] < num){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;  //找不到返回-1
    }


}
