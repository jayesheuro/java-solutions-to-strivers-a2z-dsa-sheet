package step2_sorting.lec_1_sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {

    public List<Integer> insertionSort(List<Integer> nums) {
        // //Selection sort = select minimum and swap
        // for(int i=0; i<=nums.size()-2;i++) {
        //     int minimumIndex = i;
        //     for(int j=i; j<=nums.size()-1; j++){
        //         if(nums.get(j) < nums.get(minimumIndex)){
        //             minimumIndex=j;
        //         }
        //     }
        //     //swap minimumIndex and i
        //     Integer temp = nums.get(minimumIndex);
        //     nums.set(minimumIndex, nums.get(i));
        //     nums.set(i,temp);
        // }
        // return nums;
        for(int i = 0; i < nums.size(); i++){
            for(int j = i; j > 0 && nums.get(j-1) > nums.get(j); j--){
                //swap
                Integer temp = nums.get(j-1);
                nums.set(j-1, nums.get(j));
                nums.set(j, temp);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        List<Integer> nums = new ArrayList<>(Arrays.asList(7, 0, 10, 59, 32, 32, 21, -23, 14, 5));
        System.out.println(s.insertionSort(nums));
    }
}
