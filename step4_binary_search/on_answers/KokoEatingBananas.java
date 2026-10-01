package step4_binary_search.on_answers;

public class KokoEatingBananas {
    static int findHoursToEat(int[] arr, int RATE){
        // [3,5,7,9]
        // 2
        // 2,3,4,5
        int hours = 0;
        for(int i = 0; i < arr.length; i++){
            hours += Math.ceil(arr[i]/RATE);

        }
        return hours;
    }
    // adding structure
    static int calculateEatingRate(int[]arr, int n, int h){
        int max = arr[0];
        for(int i = 0; i< n; i++){
            max=Math.max(max, arr[i]);
        }
        for(int i = 1; i <= max; i++){
            if(findHoursToEat(arr, i) <= h){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] nums = {7,15,6,3};
        int h = 8;
        System.out.println(calculateEatingRate(nums,n,h));
    }
}
