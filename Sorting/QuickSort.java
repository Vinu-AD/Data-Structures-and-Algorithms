public class QuickSort {
    public int[] quickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
    public void sort(int[] nums, int low, int high) {
        if(low >= high) return;
        int start = low, end = high;
        int mid = low + (high - low) / 2;
        int pivot = nums[mid];
        while(start <= end) {
            while(nums[start] < pivot) start++;
            while(nums[end] > pivot) end--;
            if(start <= end) {  
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        sort(nums, low, end);
        sort(nums, start, high);
    }
}