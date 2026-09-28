package step4_binary_search.on_answers;

public class SmallestDivisior {
    // O(N + (M * N)) where M is the max element
    static int smallestDivisor(int[]arr, int limit){
        int ans = 1;

        // find max
        int max = arr[0];
        for(int i: arr){
            max = Math.max(i, max);
        }
        for(int i = 1; i < max; i++) {
            int divisorSum = calculateSumOfDivisors(arr, i, limit);
            if(divisorSum <= limit){
                ans = i;
                break;
            }
        }
        return ans;
    }

    static int calculateSumOfDivisors(int []arr, int n, int limit){
        int sum = 0;
        for(int i: arr){
            sum += Math.ceil((double)i/n);
            if(sum > limit){
                return sum;
            }
        }
        return sum;
    }
    
    // O(N + N * log(max))
    static int smallestDivisorOptimal(int[]arr, int limit) {
        // find max
        int max = arr[0];
        for(int i: arr){
            max = Math.max(i, max);
        }

        // search space is 1 to max
        int low = 1;
        int high = max;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + ((high - low)/2);
            int dsum =  calculateSumOfDivisors(arr, mid, limit);

            if(dsum > limit){
                low = mid + 1;
            } else {
                ans = mid; //probable answer so move left
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5};
        System.out.println(smallestDivisorOptimal(arr, 8));
    }    
}
