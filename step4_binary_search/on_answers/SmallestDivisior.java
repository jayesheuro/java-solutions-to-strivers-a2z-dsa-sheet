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
    
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5};
        System.out.println(smallestDivisor(arr, 8));
    }    
}
