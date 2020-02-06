public class demo171 {
    public static int titleToNumber(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            result=result*26+s.charAt(i)-'A'+1;
        }
        return result;

    }

    public static void main(String[] args) {
        String x="A";
        int result=titleToNumber(x);
        System.out.println(result);
    }
}
