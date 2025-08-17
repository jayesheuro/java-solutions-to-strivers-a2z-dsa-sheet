package step1_learn_the_basics.lec_4;

public class ReverseANumber {
    public int reverseANumber(int n) {
        if (n == 0) return 0;
        int rev = 0;

        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseANumber c = new ReverseANumber();
        System.out.println(c.reverseANumber( -12));
    }
}
