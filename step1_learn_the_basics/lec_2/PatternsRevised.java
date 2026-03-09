package step1_learn_the_basics.lec_2;

public class PatternsRevised {
    static void pattern1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // 1
        // 12
        // 123
        // 1234
        // 12345

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        // 1
        // 22
        // 333
        // 4444
        // 55555

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        // 12345
        // 1234
        // 123
        // 12
        // 1

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        pattern7(5);
    }
}
