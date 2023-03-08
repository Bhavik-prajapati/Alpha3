package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ChainPairs {

    public static void main(String[] args) {
        int[][] pairs={{5,24}, {39,60},{5,28}, {27,40}, {50, 90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        for (int i = 0; i < pairs.length; i++) {
            System.out.print("[");
            for (int j = 0; j < pairs[0].length; j++) {

                System.out.print(pairs[i][j]+",");

            }
            System.out.print("]");
            System.out.println();
        }



        int chainlen=1;
        int chainend=pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0]>chainend){
                chainlen++;
                chainend=pairs[i][1];
            }


        }


        System.out.println("max len of chain is "+chainlen);
    }
}
