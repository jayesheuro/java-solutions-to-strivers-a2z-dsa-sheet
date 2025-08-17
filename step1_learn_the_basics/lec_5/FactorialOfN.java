package step1_learn_the_basics.lec_5;

public class FactorialOfN {
    int calculateFactorialRecursively(int n) {
        if (n == 1) return 1;
        return n * calculateFactorialRecursively(n - 1);
    }

    public static void main(String[] args) {
        FactorialOfN f = new FactorialOfN();
        System.out.println(f.calculateFactorialRecursively(5));
    }
}
