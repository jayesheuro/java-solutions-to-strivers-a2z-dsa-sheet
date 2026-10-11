package step4_binary_search.on_answers;

public class AllocateBooks {
    static int calcStudents(int[] arr, int maxPages) {
        int students = 1;
        int currentStudentPages = 0;

        for(int i = 0; i < arr.length; i++){
            if(currentStudentPages + arr[i] <= maxPages){
                currentStudentPages += arr[i];
            } else {
                students++;
                currentStudentPages = arr[i];
            }
        }
        return students;
    }
    static int getMinimumNumberOfPages(int[]arr, int k){
//        int ans = 0;
        int max = arr[0];
        int sum = 0;
        for(int i: arr){
            sum+=i;
            max = Math.max(i, max);
        }
        int low = max;
        int high = sum;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int s = calcStudents(arr, mid);
            if(s <= k){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[]arr = {25,46,28,49,24};
        int students = 4;
        System.out.println(getMinimumNumberOfPages(arr, students));
    }
}
