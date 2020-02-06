import java.util.HashMap;

public class demo013 {
    public static int romanToInt(String s) {
        int result=0;
        char in[]=s.toCharArray();
        HashMap map=new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length();i++){
            if(in[i]=='V' || in[i]=='L' || in[i]=='D'|| in[i]=='M'){
                result+=(int)map.get(in[i]);
            }else if(in[i]=='I'){
                if(i<s.length()-1 && (in[i+1]=='V' || in[i+1]=='X')){
                    result-=(int)map.get(in[i]);
                }else{
                    result+=(int)map.get(in[i]);
                }
            }else if(in[i]=='X'){
                if(i<s.length()-1 && (in[i+1]=='L' || in[i+1]=='C')){
                    result-=(int)map.get(in[i]);
                }else{
                    result+=(int)map.get(in[i]);
                }
            }else if(in[i]=='C'){
                if(i<s.length()-1 && (in[i+1]=='D' || in[i+1]=='M')){
                    result-=(int)map.get(in[i]);
                }else{
                    result+=(int)map.get(in[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String x="III";
        int result=romanToInt(x);
        System.out.println(result);
    }
}
