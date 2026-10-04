package step4_binary_search.on_answers;

public class CapacityToShipPackagesWithinDDays {
    static boolean isDeliveryPossible(int[] arr, int D, int i) {
        int days = 0;
        int sum = 0;
        for(int j: arr){
            if(sum + j > i){
                days++;
                sum = j;
            } else {
                sum+=j;
            }
        }
        if(sum <= i){
            days++;
        }

        return days <= D;
    }
    static int findMinCapacity(int[]arr, int D){
        int maxWeight = arr[0];
        int totalWeight = 0; //sum of weights
        for(int i: arr){
            maxWeight = Math.max(i, maxWeight);
            totalWeight+=i;
        }

//        for(int i = maxWeight; i < totalWeight; i++){
//            boolean possible = isDeliveryPossible(arr, D, i);
//            if(possible) return i;
//        }
        //        using binary search
        int low = maxWeight;
        int high = totalWeight;
        while(low <= high){
            int mid = low + (high - low )/2;
            boolean possible = isDeliveryPossible(arr, D, mid);
            if(possible) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 4, 1, 4};
        int D = 3;
        System.out.println(findMinCapacity(arr, D));
    }
}
