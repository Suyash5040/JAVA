import java.util.*;

class main{


    public static void main(String[] args){
            int i, j, k;
            int n = 4, m = 5, o = 8;
            int num = 1;


            System.out.println("1");
            for (i = 1; i <= n; i++) {

                for (j = 1; j <= m; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            System.out.println("\n2");
            for (i = 1; i <= 4; i++) {

                for (j = 1; j <= 5; j++) {
                    if (i == 1 || j == 1 || i == n || j == m)
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


            System.out.println("\n3");
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }

            System.out.println("Another way of 3");
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= m; j++) {
                    if (i >= j)
                        System.out.print("*");

                }
                System.out.println();
            }


            System.out.println("\n4");
            for (i = m; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }

            System.out.println("Another way of 4");
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= m - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            System.out.println("\n5");

            for (i = 1; i <= m; i++) {
                for (j = 1; j <= m; j++) {
                    if (i + j >= m + 1)
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


            System.out.println("\n6");

            for (i = 1; i <= m; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }


            System.out.println("\n7");
            for (i = m; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j + " ");

                }
                System.out.println();
            }

            System.out.println("Another way of 7");
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= m - i + 1; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }


            System.out.println("\n8");

            for (i = 1; i <= m; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }


            System.out.println("\n9");

            for (i = 1; i <= m; i++) {
                for (j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(1);
                    } else
                        System.out.print(0);
                }
                System.out.println();
            }


            System.out.println("\n10");
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= m; j++) {
                    if (i <= j)
                        System.out.print("*");
                    else
                        System.out.print(" ");

                }
                System.out.println();
            }


            System.out.println("\n\nADVANCE PATTERN QUESTIONS");
            System.out.println("\n1 (Butterfly Pattern)");
            //for n = 8, 1 box of (8*8)
            for (i = 1; i <= 8; i++) {
                for (j = 1; j <= 8; j++) {
                    if (i + j == 9 || i == j)
                        System.out.print("*");
                    else if (i > j && i + j <= 9) {
                        System.out.print("*");
                    } else if (i < j && i + j >= 9) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }


            System.out.println("\nAnother way of 1");
            //for n = 4, 4 boxes of(4*4)

            //upper half
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int space = 2 * (n - i);
                for (j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //Lower half
            for (i = n; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int space = 2 * (n - i);
                for (j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            System.out.println("\n2 (Solid Rhombus)");
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= 9; j++) {
                    if (i + j > 5 && i + j < 11)
                        System.out.print("*");
                    else
                        System.out.print(" ");

                }
                System.out.println();
            }


            System.out.println("\n3 (number pyramid)");
            for (i = 1; i <= m; i++) {
                //Spaces
                for (j = 1; j <= m - i; j++) {
                    System.out.print(" ");
                }

                //number
                for (j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();

            }


            System.out.println("\n4 (Palindromic Pattern)");
            for (i = 1; i <= m; i++) {
                //spaces
                for (j = 1; j <= m - i; j++) {
                    System.out.print(" ");
                }
                //first half
                for (j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                //second half
                for (j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }


            System.out.println("\n5 (Diamond Pattern)");
            for (i = 1; i <= n; i++) {
                //spaces
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                //stars
                for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            for (i = n; i >= 1; i--) {
                //spaces
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                //stars
                for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }


            System.out.println("\n6 (Hollow Butterfly Pattern)");
            for (i = 1; i <= o; i++) {
                for (j = 1; j <= o; j++) {
                    if (i == j || i + j == o + 1 || j == 1 || j == o)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();

            }


            System.out.println("\n7 (Hollow Rhombus)");
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= m - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= m; j++) {
                    if (i == 1 || i == m || j == 1 || j == m)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                System.out.println();
            }




            System.out.println("\n8 (Pascal's Triangle)");

            for (i = 1; i <= m; i++) {
                //spaces
                for (j = 1; j <= m - i; j++) {
                    System.out.print(" ");
                }
                int c = 1;
                for (j = 1; j <= i; j++) {

                    System.out.print(c + " ");
                    c = c * (i - j)/j;
                }

                System.out.println();
            }



        System.out.println("\n9 (Half pyramid)");
        for(i=1; i<=m; i++){
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }




        System.out.println("\n10 (Inverted Half Pyramid.)");
        for(i=1; i<=n; i++){
            for(j=n; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}