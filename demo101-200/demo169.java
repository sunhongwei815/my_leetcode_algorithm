public class demo169 {
    public static int majorityElement(int[] nums) {
         int count=0;
         Integer x=null;
         for(int num:nums){
             if(count==0) x=num;
             count+=(num==x)?1:-1;
         }
         return x;
    }


    public static void main(String[] args) {
        int[] x=new int[]{2,2,1,1,1,2,2};
        int result=majorityElement(x);
        System.out.println(result);
    }
}
