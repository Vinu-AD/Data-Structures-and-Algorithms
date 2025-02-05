public class MergeSort {
    public int[] mergeSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
    public void sort(int[] nums, int start, int end) {
        if(start >= end) return;
        int middle = start + (end - start) / 2;
        sort(nums, start, middle);
        sort(nums, middle + 1, end);
        merge(nums, start, middle, end);
    }
    public void merge(int[] nums, int start, int middle, int end) {
        int[] temp = new int[end - start + 1];
        int ind = 0;
        int left = start, mid = middle + 1;
        while(left <= middle && mid <= end) {
            if(nums[left] < nums[mid]) temp[ind++] = nums[left++];
            else temp[ind++] = nums[mid++];
        }
        while(left <= middle) temp[ind++] = nums[left++];
        while(mid <= end) temp[ind++] = nums[mid++];

        ind = 0;
        while(ind < temp.length) {
            nums[start + ind] = temp[ind];
            ind++;
        }
    }
}