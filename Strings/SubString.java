package Strings;

public class SubString {
//    last index is excluded here

    public static String substring(String str, int si,int ei){

        String substr="";
        for (int i = si; i < ei; i++) {
            substr+=str.charAt(i);
        }

        return substr;

    }

    public static void main(String[] args) {
        String s="HelloWorld";
//        System.out.println(substring(s,0,5));

        System.out.println(s.substring(0,5));



    }
}
