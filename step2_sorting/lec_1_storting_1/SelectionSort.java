package step2_sorting.lec_1_storting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public List<Integer> selectionSort(List<Integer> nums) {
        //Selection sort = select minimum and swap
        for(int i=0; i<=nums.size()-2;i++) {
            int minimumIndex = i;
            for(int j=i; j<=nums.size()-1; j++){
                if(nums.get(j) < nums.get(minimumIndex)){
                    minimumIndex=j;
                }
            }
            //swap minimumIndex and i
            Integer temp = nums.get(minimumIndex);
            nums.set(minimumIndex, nums.get(i));
            nums.set(i,temp);
        }
        return nums;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        List<Integer> nums = new ArrayList<>(Arrays.asList(7, 4, 1, 5, 3, 3, 2, 3, 4, 5));
        System.out.println(s.selectionSort(nums));
    }
}
