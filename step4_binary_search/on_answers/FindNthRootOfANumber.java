package step4_binary_search.on_answers;

public class FindNthRootOfANumber {
    static int findNthRoot(int n, int N) {
        int low = 0;
        int high = n;
        int ans = 0;
        while(low <= high){
            int mid = low + ((high - low)/2);
            int num = mid;
            for(int i = 2; i<=N; i++){
                num*=mid;
            }
            if(num <= n){
                // mid is a possible nth root
                ans = mid;
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 125;
        System.out.println(findNthRoot(n,3));
    }
}

/////////////////////////////////////