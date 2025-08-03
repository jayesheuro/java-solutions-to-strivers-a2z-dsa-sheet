package learn_the_basics.lec_5;

public class FibonacciNumber {

    int calculateFibonacciNumber(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calculateFibonacciNumber(n - 1) + calculateFibonacciNumber(n - 2);
    }

    //    f0 = 0
//    f1 = 1
//    f2 = 1
//    f3 = 2
//    f4 = 3
//    f5 = 5
//    f6 = 8
    public static void main(String[] args) {
        FibonacciNumber f = new FibonacciNumber();
        System.out.println(f.calculateFibonacciNumber(6));
    }
}
