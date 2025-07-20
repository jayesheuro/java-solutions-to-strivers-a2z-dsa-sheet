package learn_the_basics.lec_2;

public class Patterns {
    public void pattern1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
//            or just System.out.println();
        }
    }

    public void pattern2(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
//            or just System.out.println();
        }
    }


    public void pattern3(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.print("\n");
//            or just System.out.println();
        }
    }


    public void pattern4(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
//            or just System.out.println();
        }
    }

    public void pattern5(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
//            or just System.out.println();
        }
    }
    public void pattern6(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(j+1);
            }
            System.out.print("\n");
//            or just System.out.println();
        }
    }

    public void pattern7(int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
//            skipping the right hand side spaces
            System.out.println(); 
        }
    }

    public void pattern8(int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*n - 2*i + 1; j++) {
                System.out.print("*");
            }
//            skipping the right hand side spaces
            System.out.println();
        }
    }

    public void pattern9(int n) {
        for(int i = 1; i <= 2 * n; i++) {
            int spaces = i <= n ? n - i : i - n - 1;
            for(int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            int stars = i <= n ? (2 * i - 1) : ((2 * n) - (2 * (i - n)) + 1);
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern10(int n) {
        for(int i = 1; i <= 2 * n; i++) {
            int stars = i <= n ? (i) : ((2 * n) - i + 1);
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((i+j) % 2 == 0 ? 1 : 0);
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public void pattern13(int n) {
        int counter = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j));
            }
            System.out.println();
        }
    }

    public void pattern15(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j));
            }
            System.out.println();
        }
    }

    public void pattern16(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(64 + i));
            }
            System.out.println();
        }
    }

    public void pattern17(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int k = 64;
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(j <= i ? (char)(++k) : (char)(--k));
            }
            System.out.println();
        }
    }

    public void pattern18(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(64 + (n-i+j)));
            }
            System.out.println();
        }
    }

    public void pattern19(int n) {
        for(int i = 1; i <= n; i++) {
            int numStars = i <= (n / 2) ? (n / 2) - i + 1 : i - (n / 2);
            for(int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            int spaces = i <= (n / 2) ? (2 * i) - 2 : 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns p = new Patterns();

        System.out.println("1.==============================="); 
//        1.
//        *****
//        *****
//        *****
//        *****
//        *****
        p.pattern1(5);
        
        System.out.println("2.==============================="); 
//        2.
//        *
//        **
//        ***
//        ****
//        *****
        p.pattern2(5);
        
        System.out.println("3.==============================="); 
//        3.
//        1
//        12
//        123
//        1234
//        12345
        p.pattern3(5);
        
        System.out.println("4.==============================="); 
//        4.
//        1
//        22
//        333
//        4444
//        55555
        p.pattern4(5);
        
        System.out.println("5.==============================="); 
//        5.
//        *****
//        ****
//        ***
//        **
//        *
        p.pattern5(5);
        
        System.out.println("6.==============================="); 
//        6.
//        12345
//        1234
//        123
//        12
//        1
        p.pattern6(5);
        
        System.out.println("7.==============================="); 
//         7.
//         *
//        ***
//       *****
//      *******
//     *********
        p.pattern7(5);
        
        System.out.println("8.==============================="); 
//         8.
//     *********
//      *******
//       *****
//        ***
//         *
        
        p.pattern8(5);
        
        System.out.println("9.==============================="); 
//         9.
//         *
//        ***
//       *****
//      *******
//     *********
//     *********
//      *******
//       *****
//        ***
//         *
        p.pattern9(5);
        
        System.out.println("10.==============================="); 
//         10.
//         *
//        **
//       ***
//      ****
//     *****
//     *****
//      ****
//       ***
//        **
//         *
        p.pattern10(5);

        System.out.println("11.===============================");
//         11.
//         1
//         01
//         101
//         0101
//         10101

        p.pattern11(5);

        System.out.println("12.===============================");
//         12.
//         1      1
//         12    21
//         123  321
//         12344321

        p.pattern12(4);

        System.out.println("13.===============================");
//         13.
//         1
//         2 3
//         4 5 6
//         7 8 9 10
//         11 12 13 14 15
        p.pattern13(5); //number of rows

        System.out.println("14.===============================");
//         14.
//         A
//         AB
//         ABC
//         ABCD
//         ABCDE
        p.pattern14(5); //number of rows

        System.out.println("15.===============================");
//         15.
//         ABCDE
//         ABCD
//         ABC
//         AB
//         A
        p.pattern15(5); //number of rows

        System.out.println("16.===============================");
//         16.
//         A
//         BB
//         CCC
//         DDDD
//         EEEEE
        p.pattern16(5); //number of rows

        System.out.println("17.===============================");
//         17.
//         A
//        ABA
//       ABCBA
//      ABCDCBA
        p.pattern17(4); //number of rows

        System.out.println("18.===============================");
//         18.
        // E
        // DE
        // CDE
        // BCDE
        // ABCDE

        p.pattern18(5); //number of rows


        System.out.println("19.===============================");
//         19.
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********

        p.pattern19(10); //number of rows

    }
}
