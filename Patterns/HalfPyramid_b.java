package Patterns;

public class HalfPyramid_b {
    public static void main(String[] args) {
        int counter=0;
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n-i+1); j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
