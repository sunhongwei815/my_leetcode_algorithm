import java.util.HashSet;

public class demo202 {
    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(n);
        while(n!=1){
            n=PowerSum(n);
            if(set.contains(n)) return false;
            else set.add(n);
        }
        return true;
    }

    public static int PowerSum(int x){
        int sum=0;
        while(x!=0){
            sum+=(x%10)*(x%10);
            x/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
}
