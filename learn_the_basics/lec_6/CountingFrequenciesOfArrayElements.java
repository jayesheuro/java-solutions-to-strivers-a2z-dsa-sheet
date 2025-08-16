package learn_the_basics.lec_6;

import java.util.*;

class CountingFrequenciesOfArrayElements {

    public List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer, Integer> freqMap= new HashMap<>();
        for(int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        List<List<Integer>> output = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            output.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return output;
    }

    public static void main(String[] args) {
        CountingFrequenciesOfArrayElements cfal = new CountingFrequenciesOfArrayElements();
        int[] nums = {1,9,2,3,4,5,5,4,3,6,7,8,8,8,8,8};
        List<List<Integer>> frequencies = cfal.countFrequencies(nums);
        System.out.println(frequencies);
    }
}