public class HeapSort {
    public void heapSort(int[] arr) {
        int n = arr.length; // 4, 2, 0, 5, 1, 3

        // heapifying
        for(int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }

        // deleting the root element
        for(int ind = n - 1; ind > 0; ind--) {
            // Swapping
            int temp = arr[0];
            arr[0] = arr[ind];
            arr[ind] = temp;

            maxHeapify(arr, ind, 0);
        }
    }
    public void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2; 

        if(left < n && arr[left] > arr[largest]) 
            largest = left;
        if(right < n && arr[right] > arr[largest]) 
            largest = right;
        
        if(largest != i) {
            // Swapping
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr, n, largest);
        }
    }
}