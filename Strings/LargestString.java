package Strings;

public class LargestString {
//    print largest string check in lexicographically order
//    compareto - use
// it return 0:if s1 s2 are equal
//           <0:if s1<s2
//          >0:if s1>s2

    public static void main(String[] args) {

    String[] fruits={"apple","mango","banana"};

        String largest=fruits[0];
        for (int i = 1; i < fruits.length ; i++) {
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }


        }
            System.out.println(largest);


    }







}
