public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        sort(nums);
        return nums;
    }
    public void sort(int[] nums) {
        
        // from last position
        for(int ind = nums.length - 1; ind > 0; ind--) {
            int maxInd = ind;
            for(int itr = ind - 1; itr >= 0; itr--) {
                if(nums[itr] > nums[maxInd]) maxInd = itr;
            }
            if(maxInd != ind) {
                int temp = nums[ind];
                nums[ind] = nums[maxInd];
                nums[maxInd] = temp;
            }
        }
    }
}