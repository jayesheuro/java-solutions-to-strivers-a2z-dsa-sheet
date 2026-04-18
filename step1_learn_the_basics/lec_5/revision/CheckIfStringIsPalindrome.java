package step1_learn_the_basics.lec_5.revision;

public class CheckIfStringIsPalindrome {

    static void recursiveReverseStringSwapper(char[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        char temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
        recursiveReverseStringSwapper(arr, start, end);
    }

    static String recursiveReverseString(String str) {
        if(str.length() <= 1) {
            return str;
        }
        char[] strCharArray = str.toCharArray();
        int start = 0;
        int end = strCharArray.length - 1;
        recursiveReverseStringSwapper(strCharArray, start, end);
        return new String(strCharArray);
    }

    public static void main(String[] args) {
        String str = "BOB";
        String reverse = recursiveReverseString(str);
        System.out.println(str.equals(reverse) ? "PALINDROME" : "NOT A PALINDROME");
    }
}
