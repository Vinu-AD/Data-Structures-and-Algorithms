public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        b_sort(nums);
        return nums;
    }
    public void b_sort(int[] nums) {
        int len = nums.length;
        for(int itr = 1; itr < len; itr++) {
            boolean swapped = false;
            for(int ind = 0; ind < len - itr; ind++) {
                if(nums[ind] > nums[ind + 1]) {
                    // swap
                    int temp = nums[ind + 1];
                    nums[ind + 1] = nums[ind];
                    nums[ind] = temp;
                    swapped = true;
                }
                // System.out.print(nums[ind] + " ");
            }
            if(!swapped) break;
            // System.out.println();
        }
    }
}