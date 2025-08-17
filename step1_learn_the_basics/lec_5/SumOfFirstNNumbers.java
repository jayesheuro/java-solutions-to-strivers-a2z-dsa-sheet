package step1_learn_the_basics.lec_5;

public class SumOfFirstNNumbers {

    int calculateSumRecursively(int n) {
        if (n == 0) return 0;
        int sum = n + calculateSumRecursively(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        SumOfFirstNNumbers s = new SumOfFirstNNumbers();
        int sum = s.calculateSumRecursively(100);
        System.out.println(sum);
    }
}
