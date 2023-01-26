package AdvancePatterns;
import java.util.Scanner;

public class XipraPats {

    public static void Pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
    public static void Pattern5(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }

    public static void Pattern6(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern9(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
    public static void Pattern10(int n){
        int counter=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void Pattern11(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern12(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
    public static void Pattern13(int n){
        for (int i = n; i >=1; i--) {
            for (int j = i; j <=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern14(int n){
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void Pattern15(int n){
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
    public static void Pattern16(int n){
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
     public static void Pattern17(int n){
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=n-i+1; j++) {
                    System.out.print(i*j);
                }
                System.out.println();
            }
        }
     public static void Pattern18(int n){
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=n-i+1; j++) {
                    System.out.print(n-i+1);
                }
                System.out.println();
            }
        }

    public static void Pattern19(int n){
        for (int i = n; i >=1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
     public static void Pattern20(int n){
            for (int i = n; i >=1; i--) {
                for (int j = i; j >=1; j--) {
                    System.out.print(n-j+1);
                }
                System.out.println();
            }
        }
     public static void Pattern21(int n){
            for (int i = 1; i <=n; i++) {
                for (int j =n; j >i ; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

     public static void Pattern22(int n){
            for (int i = 1; i <=n; i++) {
                for (int j =n; j >i ; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

     public static void Pattern23(int n){
            for (int i = 1; i <=n; i++) {
                for (int j =1; j <=n-i ; j++) {
                    System.out.print(" ");
                }
                for (int j = n-i+1; j <=n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
     public static void Pattern24(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=n-i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <=i; j++) {
                        System.out.print(n-j+1);
                    }
                    System.out.println();
                }
            }
     public static void Pattern25(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =n; j >=i ; j--) {
                        System.out.print(" ");
                    }
                    for (int j = i; j >=1; j--) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            public static void Pattern26(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =n; j >=i ; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <=i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }

    public static void Pattern27(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = n; j >=i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

    public static void Pattern28(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j <=n; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
    public static void Pattern29(int n){
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >=i; j--) {
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
    public static void Pattern30(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = n; j >=i; j--) {
                        System.out.print(n-j+1);
                    }
                    System.out.println();
                }
            }
    public static void Pattern31(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = n-i+1; j >=1; j--) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            public static void Pattern32(int n){
                    int counter=1;

                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = n-i+1; j >=1; j--) {
                        System.out.print(counter);
                        counter++;
                    }
                    System.out.println();
                }
            }

          public static void Pattern33(int n){

                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j =n; j >=i; j--) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }

          public static void Pattern34(int n){
              for (int i = 1; i <=n; i++) {
                  for (int j =n; j >i ; j--) {
                      System.out.print(" ");
                  }
                  for (int j = 1; j <=i; j++) {
                      System.out.print(" *");
                  }
                  System.out.println();
              }
            }
          public static void Pattern35(int n){
                  for (int i = 1; i <=n; i++) {
                      for (int j =n; j >i ; j--) {
                          System.out.print(" ");
                      }
                      for (int j = 1; j <=i; j++) {
                          System.out.print(" "+i);
                      }
                      System.out.println();
                  }
                }
             public static void Pattern36(int n){
                  for (int i = 1; i <=n; i++) {
                      for (int j =n; j >i ; j--) {
                          System.out.print(" ");
                      }
                      for (int j = 1; j <=i; j++) {
                          System.out.print(" "+j);
                      }
                      System.out.println();
                  }
                }
         public static void Pattern37(int n){
                  for (int i = 1; i <=n; i++) {
                      for (int j =1; j <=i ; j++) {
                          System.out.print(" ");
                      }
                      for (int j = n; j >=i; j--) {
                          System.out.print("* ");
                      }
                      System.out.println();
                  }
                }
            public static void Pattern38(int n){
                  for (int i = 1; i <=n; i++) {
                      for (int j =1; j <=i ; j++) {
                          System.out.print(" ");
                      }
                      for (int j = n; j >=i; j--) {
                          System.out.print(n-i+1+" ");
                      }
                      System.out.println();
                  }
                }

            public static void Pattern39(int n){
                  for (int i = 1; i <=n; i++) {
                      for (int j =1; j <=i ; j++) {
                          System.out.print(" ");
                      }
                      for (int j = n; j >=i; j--) {
                          System.out.print(n-j+1+" ");
                      }
                      System.out.println();
                  }
                }


            public static void Pattern40(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =n; j >i ; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <=i; j++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }

                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = n; j >=i; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                }

          public static void Pattern41(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j =1; j <=i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 4; j >=i; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                for (int i = 1; i <=n; i++) {
                    for (int j =4; j >=i ; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                }


          public static void Pattern42(int n){
                for (int i = 1; i <=n; i++) {
                    for (int j = 1; j <=i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = 1; i <=n; i++) {

                    for (int j = n-1; j >=i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                }
        public static void Pattern43(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(i==1 || i==n ||j==1 || j==n){

                    System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void Pattern44(int n) {
            for (int i = 1; i <=n; i++) {
                for (int j = i; j >=1; j--) {
                    System.out.print(j);
                }
                for (int j = 3; j >=i ; j--) {
                    System.out.print("1");

                }
                System.out.println();
            }

        }
        public static void Pattern45(int n) {

            for (int i = 1; i <=n; i++) {
                for (int j =n; j >i ; j--) {
                    System.out.print("1");
                }
                for (int j = 1; j <=i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }


        }
        public static void Pattern46(int n) {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(i==1 || i==n ||j==1 || j==n){

                        System.out.print("*");
                    }else{
                        System.out.print(j*i);
                    }
                }
                System.out.println();
            }

        }
        public static void Pattern47(int n) {

            for (int i = 1; i <=n; i++) {
                for (int j =1; j <=i ; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >=i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <=n; i++) {
                for (int j =n; j >i ; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

      public static void Pattern48(int n) {
          for (int i = 1; i <=n; i++) {
              for (int j =1; j <=n-i ; j++) {
                  System.out.print(" ");
              }
              for (int j = 1; j <=i; j++) {
                  System.out.print(n-j+1);
              }
              System.out.println();
          }
          for (int i = 2; i <=n; i++) {
              for (int j =2; j <=i ; j++) {
                  System.out.print(" ");
              }
              for (int j =n; j >=i; j--) {
                  System.out.print(j);
              }
              System.out.println();
          }
        }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int n=4;
//        Pattern1(n);
//        Pattern2(n);
//        Pattern3(n);
//        Pattern4(n);
//        Pattern5(n);
//        Pattern6(n);
//        Pattern7(n);
//        Pattern8(n);
//        Pattern9(n);
//        Pattern10(n);
//        Pattern11(n);
//        Pattern12(n);
//        Pattern13(n);
//        Pattern14(n);
//        Pattern15(n);
//        Pattern16(n);
//        Pattern17(n);
//        Pattern18(n);
//        Pattern19(n);
//        Pattern20(n);
//        Pattern21(n);
//        Pattern22(n);
//        Pattern23(n);
//        Pattern24(n);
//        Pattern25(n);
//        Pattern26(n);
//        Pattern27(n);
//        Pattern28(n);
//        Pattern29(n);
//        Pattern30(n);
//        Pattern31(n);
//        Pattern32(n);
//        Pattern33(n);
//        Pattern34(n);
//        Pattern35(n);
//        Pattern36(n);
//        Pattern37(n);
//        Pattern38(n);
//        Pattern39(n);
//        Pattern40(n);
//        Pattern41(n);
//        Pattern42(n);
//        Pattern43(n);
//        Pattern44(n);
//        Pattern45(n);
//        Pattern46(n);
//        Pattern47(n);
//        Pattern48(n);


    }
}

