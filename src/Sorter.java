import java.util.Random;

public class Sorter {

    // BubbleSort
    public void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // MergeSort
    public void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int middle = start + (end - start) / 2;
            mergeSort(data, start, middle);
            mergeSort(data, middle + 1, end);
            applyMerge(data, start, middle, end);
        }
    }

    private void applyMerge(int[] data, int start, int mid, int end) {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int[] LeftPart = new int[size1];
        int[] RightPart = new int[size2];

        for (int i = 0; i < size1; ++i) LeftPart[i] = data[start + i];
        for (int j = 0; j < size2; ++j) RightPart[j] = data[mid + 1 + j];

        int i = 0, j = 0, k = start;
        while (i < size1 && j < size2) {
            if (LeftPart[i] <= RightPart[j]) data[k++] = LeftPart[i++];
            else data[k++] = RightPart[j++];
        }
        while (i < size1) data[k++] = LeftPart[i++];
        while (j < size2) data[k++] = RightPart[j++];
    }

    public int[] generateRandomArray(int total) {
        Random rand = new Random();
        int[] newArr = new int[total];
        for (int i = 0; i < total; i++) newArr[i] = rand.nextInt(5000);
        return newArr;
    }
}