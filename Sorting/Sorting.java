// https://visualgo.net/en/sorting?slide=1
// To visualize the code and algorithm with respect to our own values

class Sorting {

    public static void main(String[] args) {
        
        // int[] arr = {1, 2, 3, 4, 5}; // already sorted
        // int[] arr = {5, 4, 3, 2, 1, 0}; // reverse sorted
        // int[] arr = {3, 3, 8, 5, 5, 2, 1, 7, 7}; // duplicate elements
        int[] arr = {7, 2, 9, 5, 6, 8, 3, 1, 0, 4}; // random order

        // int[] arr = {3, 3, 3, 3, 3, 3}; // edge case 1
        // int[] arr = {5, -1, 0, -3, 4}; // edge case 2
        // int[] arr = {9}; // edge case 3
        // int[] arr = {}; // edge case 4

        // large test case
        // int[] arr = {-12, 437, 431, 127, 1, 385, 714, 245, 110, 409, 637, -100, 842, 263, 671, 864, 152, 74, -80, 
        //     652, 631, 189, 530, 327, 0, 729, 790, 892, 328, 62, 759, 903, 264, -5, 151, 620, 384, 935, 881, 422, 
        //     511, 771, 783, 550, 210, 392, 646, 2, 336, 713, 709, 207, 76, -29, 900, -65, 151, -97, 1000, -69, 300, 998, 
        //     77, 858, 805, 254, 55, 861, 682, -51, 333, 986, 920, 661, 618, 627, 218, -69, 633, 121, 620, 730, 649, 
        //     13, 532, 281, 233, 428, 337, 980, 106, 179, 450, -4, 347, 724, 155, 945, 862, 827, 369, 974, 707};

        // SelectionSort select = new SelectionSort();
        // BubbleSort bubble = new BubbleSort();
        // InsertionSort insertion = new InsertionSort();
        // MergeSort merge = new MergeSort();
        // QuickSort quick = new QuickSort();
        HeapSort heap = new HeapSort();

        // select.selectionSort(arr);
        // bubble.bubbleSort(arr);
        // insertion.insertionSort(arr);
        // merge.mergeSort(arr);
        // quick.quickSort(arr);
        heap.heapSort(arr);

        for (int ind = 0; ind < arr.length; ind++) 
            System.out.print(arr[ind] + " ");

    }
}
