package learn_the_basics.lec_4;

public class CheckPalindrome {
    public boolean checkPalindrome(int n) {
////         first approach - calculate reverse number and compare
//        if (n / 10 == 0) return true;
//        int rev = 0;
//        int nCopy = n;
//        while(n != 0) {
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n /= 10;
//        }
//        return nCopy == rev;
//
        // second approach using StringBuilder
        String nString = "" + Math.abs(n);
        String nRev = new StringBuilder(nString).reverse().toString();
        return nString.equals(nRev);
    }

    public static void main(String[] args) {
        CheckPalindrome c = new CheckPalindrome();
        System.out.println(c.checkPalindrome(-989));
    }
}
