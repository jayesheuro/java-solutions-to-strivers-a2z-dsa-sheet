package step1_learn_the_basics.lec_5.revision;

public class SumOfFirstNNUmbers {
    static int recursiveSum(int n) {
        if(n == 0) return 0;
        return n + recursiveSum(n-1);
    }

    public static void main(String[] args) {
        int sum = recursiveSum(3);
        System.out.println(sum);        
    }
}
