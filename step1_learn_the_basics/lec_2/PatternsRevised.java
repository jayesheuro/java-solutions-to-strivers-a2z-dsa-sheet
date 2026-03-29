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
            for (int j = 1; j <= (n - i + 1); j++) {
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
            for (int j = 1; j <= (n - i + 1); j++) {
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
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * (n - i) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= (i <= n ? (n - i) : (i - n - 1)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i <= n ? (2 * i - 1) : (2 * (2 * n - i) + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        //     *
        //    **
        //   ***
        //  ****
        // *****
        // *****
        //  ****
        //   ***
        //    **
        //     *

        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= (i <= n ? (n - i) : (i - n - 1)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i <= n ? i : (2 * n - i + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        // 1
        // 01
        // 101
        // 0101
        // 10101

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int v = (i + j) % 2 == 0 ? 1 : 0;
                System.out.print(v);
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {

        //1      1
        //12    21
        //123  321
        //12344321
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else if (j <= 2*n - i) {
                    System.out.print(".");
                } else {
                    System.out.print(2*n - j + 1);
                }
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {

        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {

        //A
        //AB
        //ABC
        //ABCD
        //ABCDE
        int k;
        for (int i = 1; i <= n; i++) {
            k = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) k++);
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {

        //ABCDE
        //ABCD
        //ABC
        //AB
        //A
        int k;
        for (int i = 1; i <= n; i++) {
            k = 'A';
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char) k++);
            }
            System.out.println();
        }
    }
    
    static void pattern16(int n) {

        //A
        //BB
        //CCC
        //DDDD
        //EEEEE
        int k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) k);
            }
            k++;
            System.out.println();
        }
    }

    static void pattern17(int n) {

        //   A
        //  ABA
        // ABCBA
        //ABCDCBA
        int k;
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(' ');
            }
            k = 'A';
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print((char) ((spaces + j) < n ? k++ : k--));
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {

        // E
        // DE
        // CDE
        // BCDE
        // ABCDE
        int k = 'E';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (k - i + j));
            }
            System.out.println();
        }
    }
    
    static void pattern19(int n) {
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
        for (int i = 1; i <= 2*n; i++) {
            for (int j = 1; j <= 2*n; j++) {
                if (j <= n) {
                    if (i <= n) {
                        if (j <= n - i + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (j <= i-n) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");

                        }
                    }
                } else {
                    if (i <= n) {
                        if (j <= n + i - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        if (j <= 2*n - (i - n)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern20(int n) {
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
        for (int i = 1; i <= 2*n; i++) {
            int stars = (i <= n) ? i : (2*n - i + 1);
            int spaces = 2 * (n - stars);
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern21(int n) {
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                // value = n - minimum distance from all edges
                System.out.print(n - minDist);
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
        // pattern7(5);
        // pattern8(5);
        // pattern9(5);
        // pattern10(5);
        // pattern11(5);
        // pattern12(5);
        // pattern13(5);
        // pattern14(5);
        // pattern15(5);
        // pattern16(5);
        // pattern17(5);
        // pattern18(5);
        // pattern19(5);
        // pattern20(5);
        // pattern21(5);
        pattern22(4);
    }
}
