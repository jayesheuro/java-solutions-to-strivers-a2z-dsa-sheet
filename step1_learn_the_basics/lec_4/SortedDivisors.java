package step1_learn_the_basics.lec_4;

import java.util.ArrayList;
import java.util.List;

public class SortedDivisors {
    public List<Integer> sortedDivisors (int n) {
        List<Integer> list = new ArrayList<>();
            for(int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
        return list;
    }

    public static void main(String[] args) {
        SortedDivisors sd = new SortedDivisors();
        System.out.println(sd.sortedDivisors(12));
    }
}
