package ArrayList;
import java.util.ArrayList;
public class PairSum {

//    bruteforce
    public static boolean pairsum(ArrayList<Integer> list,int target)
    {
        for (int i = 0; i < list.size(); i++) {

            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j)==target){
                    return true;
                }

            }

        }
    return false;
    }

//    2 pointer approach
    public static boolean pairsum1(ArrayList<Integer> list,int target)
    {
        int lp=0;
        int rp=list.size()-1;

        while (lp!=rp){

            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    //pair sum 2=array is sorted and rotated...
    //modular arithmetic...

    public static boolean pairsum2(ArrayList<Integer> list,int target)
    {
        int n=list.size();
        int pivot=-1;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)>list.get(i+1)){
                pivot=i;
                break;
            }
        }

        int lp=pivot+1;
        int rp=pivot;


        while (lp!=rp){

            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target=16;
        System.out.println(pairsum2(arr,target));
    }
}
