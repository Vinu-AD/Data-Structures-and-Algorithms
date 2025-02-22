
public class HeapSort {
    public void heapSort(int[] arr) {
        int len = arr.length;

        // heapify from last parent to the root
        for(int ind = len / 2 - 1; ind >= 0; ind--) {
            maxHeapify(arr, len, ind);
        }

        // swap the root with last leaf for sorting
        for(int ind = len - 1; ind > 0; ind--) {
            int temp = arr[0];
            arr[0] = arr[ind];
            arr[ind] = temp;
            maxHeapify(arr, ind, 0);
        }
    }
    public void maxHeapify(int[] arr, int len, int ind) {
        int parent = ind;
        int leftChild = ind * 2 + 1;
        int rightChild = ind * 2 + 2;

        if(leftChild < len && arr[leftChild] > arr[parent]) 
            parent = leftChild;
        if(rightChild < len && arr[rightChild] > arr[parent])
            parent = rightChild;
        
        // only if changes happened between parent and child
        if(parent != ind) {
            int temp = arr[parent];
            arr[parent] = arr[ind];
            arr[ind] = temp;
            maxHeapify(arr, len, parent);
        }
    }
}