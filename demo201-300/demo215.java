import java.util.PriorityQueue;

public class demo215 {
    //数组中第k大的元素(创建堆)
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();

        //遍历数组放入堆中：
        for(int n:nums){
            p.add(n);
            if(p.size()>k){
                p.poll();
            }
        }
        return p.poll();

    }

    public static void main(String args[]){
        int[] nums=new int[]{2,3,6,8,4,1};
        int k=2;
        int x=findKthLargest(nums,k);
        System.out.println(x);
    }
}
