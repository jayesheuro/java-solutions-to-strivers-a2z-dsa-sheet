package step4_binary_search.on_answers;
public class FindNthRootOfANumber {

    static int multiply(int num, int times, int n) {
        int ans = 1;

        for (int i = 1; i <= times; i++) {
            ans *= num;

            // Avoid unnecessary multiplication and overflow
            if (ans > n) {
                return ans;
            }
        }

        return ans;
    }

    static int findNthRoot(int n, int N) {
        int low = 0;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (multiply(mid, N, n) <= n) {
                // mid is a possible nth root
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 125;
        int N = 3;

        System.out.println(findNthRoot(n, N));
    }
}