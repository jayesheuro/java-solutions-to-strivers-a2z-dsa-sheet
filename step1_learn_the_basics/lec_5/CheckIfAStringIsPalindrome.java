package step1_learn_the_basics.lec_5;

public class CheckIfAStringIsPalindrome {
    char[] swappingHelper(char[] s, int i, int j) {
        if (i >= j) return s;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return swappingHelper(s, i + 1, j - 1);
    }

    String reverseStringRecursively(String s, int size) {
        char[] c = s.toCharArray();
        return new String(swappingHelper(c, 0, size - 1));
    }

    public static void main(String[] args) {
//        String s = "JAYESH";
        String s = "JayyaJ";
        CheckIfAStringIsPalindrome r = new CheckIfAStringIsPalindrome();
        String reversedString = r.reverseStringRecursively(s, s.length());
        System.out.println(s.equals(reversedString));
    }
}
