package step3_arrays.lec_2_medium;

public class StockBuyAndSell {
    static void stockBuyAndSell(int[] arr) {
        int profit = 0, buy = -1, sell = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > profit) {
                    profit = arr[j] - arr[i];
                    buy = i + 1;
                    sell = j + 1;
                }
            }
        }
        System.out.printf("We should buy on day %d and sell on day %d to make a profit of %d", buy, sell, profit);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        stockBuyAndSell(arr);
    }
}
