package Stack;
import java.util.Stack;
class NextGreaterElement{
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        Stack<Integer> s1=new Stack<>();
        int nextG[]=new int[arr.length];

        for (int i = arr.length-1; i >=0; i--) {

            while (!s1.isEmpty() && arr[s1.peek()] <= arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=arr[s1.peek()];
            }
            s1.push(i);
        }

        for (int i = 0; i < nextG.length; i++) {
            System.out.print(nextG[i]+" ");
        }
        System.out.println();
    }
}