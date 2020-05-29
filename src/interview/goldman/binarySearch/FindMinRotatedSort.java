package interview.goldman.binarySearch;

public class FindMinRotatedSort {
    public static int findMinRotatedSort(int[] array) {
        int l = 0, r = array.length, m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (array[m] > array[m + 1]) {
                return array[m + 1];
            }
            if (array[l] < array[m]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        int[] array = {7, 6, 1, 2, 3, 4, 5};
        System.out.println(findMinRotatedSort(array));
    }
}
