package step1_learn_the_basics.lec_5.revision;

public class FactorialOfN {
    static int factorial(int n) {
        // if(n == 1) return 1;
        // return n * factorial(n - 1);

        return (n == 1) ? 1 : (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
