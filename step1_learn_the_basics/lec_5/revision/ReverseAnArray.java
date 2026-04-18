package step1_learn_the_basics.lec_5.revision;

public class ReverseAnArray {

    //NOTE: this function can also be made generic by using generic type instead of an int[] arr.
    // similar logic is being used in CheckIfStringIsPalindrome.
    static void recursiveReverseSwapper(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
        recursiveReverseSwapper(arr, start, end);
    }

    static void recursiveReverse(int[] nums) {
        if(nums.length <= 1) {
            return;
        }

        int start = 0;
        int end = nums.length - 1;
        recursiveReverseSwapper(nums, start, end);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        recursiveReverse(array);
        for(int i : array) {
            System.out.print(i);
        }
    }
}
