package step3_arrays.lec_1_easy;

// import java.util.HashMap;
// import java.util.Map;

public class NumberThatAppearsOnce {

    static int findNumberThatAppearsOnce(int[] arr) {
        // // BRUTE: O(n) time, O(n/2 +1) space
        // Map<Integer, Integer> m = new HashMap<>(); // An array can also be used
        // for (int i : arr) {
        // if (m.containsKey(i)) {
        // m.remove(i);
        // } else {
        // m.put(i, 1);
        // }
        // }
        // // at the end map will have only 1 key value pair
        // return m.keySet().iterator().next();

        // OPTIMAL use XOR, Time - O(N), Space - O(1)
        int xor = 0;
        for (int i : arr) {
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int oddOne = findNumberThatAppearsOnce(arr);
        System.out.println(oddOne);
    }
}
