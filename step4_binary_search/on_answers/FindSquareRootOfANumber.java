package step4_binary_search.on_answers;

public class FindSquareRootOfANumber {
    // brute
    static int findSquareRoot(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(findSquareRoot(n));
    }
}
