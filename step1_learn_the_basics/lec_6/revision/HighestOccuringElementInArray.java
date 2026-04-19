package step1_learn_the_basics.lec_6.revision;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringElementInArray {
    static int findMostFrequent(int[] numbers) {
        Map<Integer,Integer> m = new HashMap<>();
        int maxNumber = -1; //assuming -1 will never exist in the array
        int maxFrequency = 0;
        for(int i: numbers) {
            int currentFrequency = m.getOrDefault(i, 0) + 1;
            m.put(i, currentFrequency);
            if(currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                maxNumber = i;
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,3,4,5,6,2,2,2,1};
        int highestOccuring = findMostFrequent(arr);
        System.out.println(highestOccuring);        
    }
}
