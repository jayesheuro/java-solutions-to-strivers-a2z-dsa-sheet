package step1_learn_the_basics.lec_4.revision;

public class CheckForPrime {

    static String checkForPrime(int n) {
        if (n <= 1) return "NONE";
        if (n == 2) return "PRIME";
        if (n % 2 == 0) return "COMPOSITE";

        // only need to check factors upto square root of n
        // only need to check for odd numbers
        for(int i = 3; i * i < n; i = i+2) {
            if(n % i == 0) {
                return "COMPOSITE";
            }
        }
        return "PRIME";
    }
    public static void main(String[] args) {
        System.out.println(checkForPrime(109));
    }
}
