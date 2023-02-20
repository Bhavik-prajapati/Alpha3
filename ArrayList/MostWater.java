package ArrayList;
import java.util.ArrayList;
public class MostWater {

//    bruteforce approach
//    public static int storeWater(ArrayList<Integer> h){
//        int maxwater=0;
//        for (int i = 0; i < h.size(); i++) {
//            for (int j = i+1; j <h.size() ; j++) {
//
//                int height=Math.min(h.get(i),h.get(j));
//                int width=j-i;
//                int currwater=height*width;
//                maxwater=Math.max(maxwater,currwater);
//            }
//        }
//        return maxwater;
//    }

//    2 pointer approach
    public static int storeWater(ArrayList<Integer> h){
        int maxwater=0;
        int lp=0;
        int rp=h.size()-1;
        while (lp<rp){
            int height=Math.min(h.get(lp),h.get(rp));
            int width=rp-lp;
            int currwater=height*width;
            maxwater=Math.max(maxwater,currwater);


            if(h.get(lp)<h.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

            return maxwater;
        }


    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
