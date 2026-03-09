package step1_learn_the_basics.lec_2;

public class PatternsRevised {
    static void Pattern1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        // *
        // **
        // ***
        // ****
        // *****

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //    Pattern1(5);
            Pattern2(5);
        }
}
