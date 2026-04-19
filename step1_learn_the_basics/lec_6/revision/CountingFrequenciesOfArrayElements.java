package step1_learn_the_basics.lec_6.revision;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequenciesOfArrayElements {
    static Map<Integer,Integer> countFrequenciesUsingHashMap(int[] numbers) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i: numbers) {
            m.put(i, m.getOrDefault(i,0) + 1);
        }
        return m;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,3,4,5,6,2,2,2,1};
        // Map<Integer,Integer> numFreqMap = countFrequenciesUsingHashMap(arr);
        // for(Map.Entry<Integer, Integer> entry : numFreqMap.entrySet()) {
        //     System.out.println(entry.getKey() + " comes " + entry.getValue() + " times");
        // }
        
        // Below Implementation by using a hashing array
        // Considering the max number we can have in array is 10
        int[] freq = new int[10];
        for(int i: arr){
            freq[i]++;
        }
        for(int i: arr){
            if(freq[i] >= 1) {
                System.out.println(i + " comes " + freq[i] + " times");
                freq[i] = 0;
            }
        }
    }
}
