package step1_learn_the_basics.lec_4.revision;

public class CheckPalindrome {
    static boolean checkPalindrome(int n) {
        int rev = 0;
        int nCopy = n;
        while(nCopy != 0) {
            rev = rev * 10 + (nCopy % 10);
            nCopy /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        boolean isPalindrome = checkPalindrome(232);
        System.out.println(isPalindrome ? "YES" : "NO");
    }
}
