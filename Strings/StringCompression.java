package Strings;

public class StringCompression {
    public static String compress(String str){
        String newStr="";
        for (int i = 0; i <str.length() ; i++) {
            Integer counter=1;
            while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                counter++;
                i++;
            }
            newStr+=str.charAt(i);
            if(counter>1){
                newStr+=counter.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String s="aaabbbcccd";
        System.out.println(compress(s));

    }
}
