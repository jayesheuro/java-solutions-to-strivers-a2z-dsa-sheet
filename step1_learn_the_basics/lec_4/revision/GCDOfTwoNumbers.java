package step1_learn_the_basics.lec_4.revision;

public class GCDOfTwoNumbers {
    static int findGCD(int n, int m) {
        // Normal Brute Approach
        // if(n <= 0 || m <= 0) {
        //     System.out.println("Invalid numbers. Enter numbers greater than 0");
        //     return -1;
        // } else if (n == 1 || m == 1) {
        //     return 1;
        // } else if (Math.abs(n) == Math.abs(m)) {
        //     return n;
        // } else {
        //     // GCD is the maximum number that divides both n and m
        //     // check greater
        //     // loop from smaller to 1 and divide both, return if divides both
        //     int greater = n >= m ? n : m;
        //     int smaller = greater == n ? m : n;
        //     int gcd = smaller;
        //     while(gcd != 0) {
        //         if(greater % gcd == 0 && smaller % gcd == 0) {
        //             return gcd;
        //         }
        //         gcd--;
        //     }
        // }

        // Euclidean algorithm - the HCF of a and b (where a > b), is the same as HCF of b and (a % b)
        // eg - 72,32 > HCF(32, 72%32) > HCF(32,8) >>> HCF (8, 32%8) > HCF(8, 0) ===> The other number becomes 0 Hence HCF is 8
        
        if(n <= 0 || m <= 0) {
            System.out.println("Invalid numbers. Enter numbers greater than 0");
            return -1;
        }
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        while(min != 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return max;
    }

    public static void main(String[] args) {
        int GCD = findGCD(72,32);
        System.out.println("GCD is " + GCD);
    }
}
