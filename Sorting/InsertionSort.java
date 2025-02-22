public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        
        for(int itr = 1; itr < nums.length; itr++) {
            for(int ind = itr; ind > 0; ind--) {
                if(nums[ind] < nums[ind - 1]) {
                    int temp = nums[ind];
                    nums[ind] = nums[ind - 1];
                    nums[ind - 1] = temp;
                }
                else break;
            }
        }

        return nums;
    }
}