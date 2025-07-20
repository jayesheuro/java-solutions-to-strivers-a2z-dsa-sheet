package learn_the_basics.lec_2;

public class Patterns {
    void pattern1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
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
    }
}
