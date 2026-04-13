package step1_learn_the_basics.lec_4.revision;

public class CountAllDigitsOfANumber {
    static int countAllDigitsOfANumber(int n) {
        int count = 0;
        while(n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 1234;
        int count = countAllDigitsOfANumber(num);
        System.out.println("Number: " + num);
        System.out.println("Count: " + count);
    }
}
