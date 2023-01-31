package Strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Hw {

    public static void Q1(String str){

        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
                counter++;
            }

//            if(String.valueOf(str.charAt(i)).equals("a")||String.valueOf(str.charAt(i)).equals("e")||String.valueOf(str.charAt(i)).equals("i")||String.valueOf(str.charAt(i)).equals("o")||String.valueOf(str.charAt(i)).equals("u")){
//                counter++;
//            }
        }
        System.out.println(counter);

    }
    public static void AnaGramsQ2(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
//            for(char ch:str1charArray){
//                System.out.print(ch+" ");
//            }
//            System.out.println();
//            for(char ch:str2charArray){
//                System.out.print(ch+" ");
//            }

            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println(str1+" & "+str2+" is Anagram");
            }else{
                System.out.println(str1+" & "+str2+" is not an Anagram");
            }
        }else{
            System.out.println(str1+" & "+str2+" is not an Anagram");
        }

    }
    public static void main(String[] args) {
//        StringBuilder s1=new StringBuilder("abcdefghi");
//        String s="Abcdefghi";
//        Q1(s);
//        String s="Apnacollege".replace("l","");
//        System.out.println(s);
        String str1="earth";
        String str2="heart";
        AnaGramsQ2(str1,str2);












    }
}
