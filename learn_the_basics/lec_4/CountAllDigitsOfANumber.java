package learn_the_basics.lec_4;

public class CountAllDigitsOfANumber {
    public int countNumberOfDigits(int n) {
        int count = 0;

        if (n <= 0) return 0;

        while (n / 10 != 0) {
            n = n / 10;
            count++;
        }
        return count + 1;
    }

    public static void main(String[] args) {
        CountAllDigitsOfANumber c = new CountAllDigitsOfANumber();
        System.out.println(c.countNumberOfDigits(1234));
    }
}
