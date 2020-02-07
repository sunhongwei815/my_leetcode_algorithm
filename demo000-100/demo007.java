public class demo007 {
    public static int reverse(int x){
        int flag=1,p=0;
        int[] out=new int[13];
        if(x<0){
            flag=-1;
        }
        x=Math.abs(x);
        while(x>0){
            out[p++]=x%10;
            x=x/10;
        }
        long result=0;
        for(int i=0;i<p;i++){
            result=result*10+out[i];
        }
        if(result>Math.pow(2,31)-1 || result<-Math.pow(2,31)){
            return 0;
        }
        return (int)result * flag;

    }

    public static void main(String[] args) {
        int x=1534236469;
        int result=reverse(x);
        System.out.println(result);
    }
}

