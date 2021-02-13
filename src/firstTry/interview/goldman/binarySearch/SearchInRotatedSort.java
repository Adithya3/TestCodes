package firstTry.interview.goldman.binarySearch;

public class SearchInRotatedSort {
    public static boolean searchInRotatedSort(int[] array, int value) {
        int l = 0, r = array.length - 1, m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (array[m] == value) return true;
            if (array[m] > array[l]) {
                if (value < array[m] && value >= array[l]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            } else {
                if (value > array[m] && value <= array[r]) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {8, 9, 10, 1, 2, 5, 6};
        System.out.println(searchInRotatedSort(array, 1));
    }
}
