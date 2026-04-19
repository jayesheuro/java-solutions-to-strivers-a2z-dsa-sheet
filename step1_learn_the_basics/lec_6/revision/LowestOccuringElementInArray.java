package step1_learn_the_basics.lec_6.revision;

import java.util.HashMap;
import java.util.Map;

public class LowestOccuringElementInArray {
    static int findLeastFrequent(int[] numbers) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i: numbers) {
            int currentFrequency = m.getOrDefault(i, 0) + 1;
            m.put(i, currentFrequency);
        }
        int leastNumber = -1; //assuming -1 will never exist in the array
        int leastFrequency = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : m.entrySet()) {
            if(entry.getValue() < leastFrequency) {
                leastFrequency = entry.getValue();
                leastNumber = entry.getKey();
            }
        }

        return leastNumber;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,3,3,4,5,6,2,2,2,1};
        int lowestOccuring = findLeastFrequent(arr);
        System.out.println(lowestOccuring);        
    }
}
