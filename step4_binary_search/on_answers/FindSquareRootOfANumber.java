package step4_binary_search.on_answers;

public class FindSquareRootOfANumber {
    // brute
    static int findSquareRoot(int n) {
        return (int) Math.sqrt(n);
    }

    // uses binary search
    static int findSquareRootOptimal(int n){
        int low = 0;
        int high = n;
        int ans = 0;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(mid <= n / mid){
                // mid is a possible square root
                ans = mid;
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(findSquareRootOptimal(n));
    }
}
