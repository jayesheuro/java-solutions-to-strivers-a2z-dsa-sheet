package step1_learn_the_basics.lec_4;

public class CheckForPrime {
    public boolean check (int n) {
        boolean flag = true;
        for (int i = 2; i <= n/2; i++) {
//            System.out.println("Loop ran for " + (i-1) + " times");
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        CheckForPrime c = new CheckForPrime();
        System.out.println(c.check(23));
    }
}
