package Stack;

import com.sun.source.tree.BreakTree;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {

        String str1="((a+b))";//true
        String str2="(a-b)";//false

//        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));


    }

    private static boolean isDuplicate(String str1) {  //0(n)

        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str1.length(); i++) {

            char ch=str1.charAt(i);
            if(ch==')'){
                int count=0;
                while (s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }

        }
            return false;
    }

}
