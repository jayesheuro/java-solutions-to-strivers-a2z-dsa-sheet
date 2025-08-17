package step1_learn_the_basics.lec_5;

public class Print1ToN {
    void print1ToN(int n) {
        if(n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Print1ToN p = new Print1ToN();
        p.print1ToN(100);
    }
}
