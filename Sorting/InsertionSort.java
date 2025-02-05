public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        sort(nums);
        return nums;
    }
    public void sort(int[] nums) {
        for(int itr = 1; itr < nums.length; itr++) {
            int temp = nums[itr];
            int ind = itr - 1;
            while(ind >= 0 && nums[ind] > temp) {
                nums[ind + 1] = nums[ind];
                ind--;
            }
            nums[ind + 1] = temp;
        }
    }
}
