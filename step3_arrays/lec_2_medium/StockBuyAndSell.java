package step3_arrays.lec_2_medium;

public class StockBuyAndSell {
    static void stockBuyAndSell(int[] arr) {
        // int profit = 0, buy = -1, sell = -1;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] - arr[i] > profit) {
        // profit = arr[j] - arr[i];
        // buy = i + 1;
        // sell = j + 1;
        // }
        // }
        // }
        // System.out.printf("We should buy on day %d and sell on day %d to make a
        // profit of %d", buy, sell, profit);

        int profit = 0;
        int buy = -1, sell = -1;
        int min = Integer.MAX_VALUE;
        int tempBuy = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                tempBuy = i + 1;
            }
            if (arr[i] - min > profit) {
                profit = arr[i] - min;
                sell = i + 1;
                buy = tempBuy;
            }
        }
        System.out.printf("We should buy on day %d and sell on day %d to make a profit of %d", buy, sell, profit);

    }

    public static void main(String[] args) {
        // int[] arr = { 7, 1, 5, 3, 6, 4 };
        int[] arr = { 50, 1, 20, 100, 10, 40 };
        stockBuyAndSell(arr);
    }
}
