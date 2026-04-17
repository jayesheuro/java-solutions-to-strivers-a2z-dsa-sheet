package step1_learn_the_basics.lec_5.revision;

public class Print1ToN {
    static void print1ToN(int n) {
        if(n != 0) {
            print1ToN(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        print1ToN(10);
    }
}
