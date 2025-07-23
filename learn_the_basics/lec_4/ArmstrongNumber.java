package learn_the_basics.lec_4;

import java.util.Arrays;

public class ArmstrongNumber {
    public boolean check(int n) {
        System.out.println("Checking for number " + n);
        int nCopy = n;
        int numDigits = 0;
        while (nCopy != 0) {
            numDigits++;
            nCopy = nCopy / 10;
        }
        nCopy = n;
        int n2 = 0;
        while (nCopy != 0) {
            int digit = nCopy % 10;
            n2 = (int) (n2 + Math.pow(digit, numDigits));
            nCopy = nCopy / 10;
        }
        return n == n2;
    }

    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        System.out.println(a.check(153));

    }
}
