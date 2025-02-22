public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        
        int len = nums.length;
        for(int pass = 1; pass < len; pass++) {
            boolean swapped = false;
            for(int ind = 0; ind < len - pass; ind++) {
                if(nums[ind] > nums[ind + 1]) {
                    int temp = nums[ind + 1];
                    nums[ind + 1] = nums[ind];
                    nums[ind] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        return nums;
    }
}