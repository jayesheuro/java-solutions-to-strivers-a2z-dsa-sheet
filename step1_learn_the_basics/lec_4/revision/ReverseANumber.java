package step1_learn_the_basics.lec_4.revision;

public class ReverseANumber {
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 1234;
        int reverse = reverse(num);
        System.out.println("Number: " + num);
        System.out.println("Reverse: " + reverse);
    }
}
