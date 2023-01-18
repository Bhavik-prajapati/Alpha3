package Patterns;

public class Floyds {
    public static void main(String[] args) {

        int counter=1;
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("");

        }

    }
}
