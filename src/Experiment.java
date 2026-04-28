public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public void runAllExperiments() {
        // Testing sizes: Small (10), Medium (100), Large (1000)
        int[] testSizes = {10, 100, 1000};

        for (int size : testSizes) {
            System.out.println("ARRAY SIZE: " + size);

            int[] original = sorter.generateRandomArray(size);

            //BubbleSort
            int[] bubbleData = original.clone();
            long t1 = System.nanoTime();
            sorter.bubbleSort(bubbleData);
            long t2 = System.nanoTime();
            System.out.println("Bubble Sort Time : " + (t2 - t1) + " ns");

            //MergeSort
            int[] mergeData = original.clone();
            long t3 = System.nanoTime();
            sorter.mergeSort(mergeData, 0, mergeData.length - 1);
            long t4 = System.nanoTime();
            System.out.println("Merge Sort Time  : " + (t4 - t3) + " ns");

            //BinarySearch
            int targetValue = mergeData[size / 2];
            long t5 = System.nanoTime();
            int result = searcher.binarySearch(mergeData, targetValue);
            long t6 = System.nanoTime();

            System.out.println("Binary Search Time: " + (t6 - t5) + " ns");
            System.out.println("Found " + targetValue + " at index: " + result);
        }
    }
}