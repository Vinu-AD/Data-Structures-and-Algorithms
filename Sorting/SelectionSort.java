
public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        int len = nums.length;
        for(int pos = 0; pos < len; pos++) {
            int minInd = pos;
            for(int itr = pos + 1; itr < len; itr++) {
                if(nums[minInd] > nums[itr]) 
                    minInd = itr;
            }
            if(minInd != pos) {
                int temp = nums[pos];
                nums[pos] = nums[minInd];
                nums[minInd] = temp;
            }
        }
        return nums;
    }
}