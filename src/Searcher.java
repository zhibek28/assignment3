public class Searcher {
    //Binary Search
    public int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == target) return mid;
            if (data[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}