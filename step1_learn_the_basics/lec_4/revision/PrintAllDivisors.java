package step1_learn_the_basics.lec_4.revision;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {

    static List<Integer> getAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; (i * i <= n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int n = 121;
        List<Integer> divisors = getAllDivisors(n);
        System.out.println(divisors);
    }
}
