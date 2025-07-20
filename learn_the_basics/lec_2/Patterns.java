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
    public static void main(String[] args) {
        Patterns p = new Patterns();

//        1.
//        *****
//        *****
//        *****
//        *****
//        *****
        p.pattern1(5);

//        2.
//        *
//        **
//        ***
//        ****
//        *****
        p.pattern2(5);

//        3.
//        1
//        12
//        123
//        1234
//        12345
        p.pattern3(5);

//        4.
//        1
//        22
//        333
//        4444
//        55555
        p.pattern4(5);

//        5.
//        *****
//        ****
//        ***
//        **
//        *
        p.pattern5(5);

//        6.
//        12345
//        1234
//        123
//        12
//        1
        p.pattern6(5);
    }
}
