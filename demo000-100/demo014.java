public class demo014 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }

        for(int i=0;i<strs[0].length();i++){  //第一个字符串长度
            for(int j=1;j<strs.length;j++){   //数组长度
                if(strs[j].length()<=i){
                    return strs[0].substring(0,i);
                }
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String[] strs=new String[]{"flower","flow","flight"};
        String result=longestCommonPrefix(strs);
        System.out.println(result);
    }
}
