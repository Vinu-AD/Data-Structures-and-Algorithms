public class MergeSort {
    public int[] mergeSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    public void sort(int[] nums, int start, int end) {
        if(start >= end) return;
        int middle = (start + end) / 2;
        sort(nums, start, middle); // left part
        sort(nums, middle + 1, end);// right part
        merge(nums, start, middle, end); // merge the left and right part
    }

    public void merge(int[] nums, int start, int middle, int end) {
        int[] aux = new int[end - start + 1];
        int ind = 0; // for array auxiliary[index]
        int left = start; // left part
        int mid = middle + 1; // right part
        
        while(left <= middle && mid <= end) {
            if(nums[left] <= nums[mid]) 
                aux[ind++] = nums[left++];
            else 
                aux[ind++] = nums[mid++];
        }

        while(left <= middle) 
            aux[ind++] = nums[left++];
        while(mid <= end) 
            aux[ind++] = nums[mid++];
        
        for(ind = 0; ind < aux.length; ind++) 
            nums[ind + start] = aux[ind]; // copying to the original array
    }
}