package step1_learn_the_basics.lec_4;

public class CountAllDigitsOfANumber {
    public int countNumberOfDigits(int n) {
        n = Math.abs(n);

        if (n == 0) return 1;

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountAllDigitsOfANumber c = new CountAllDigitsOfANumber();
        System.out.println(c.countNumberOfDigits(1234));
    }
}
