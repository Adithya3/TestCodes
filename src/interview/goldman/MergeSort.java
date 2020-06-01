package interview.goldman;

public class MergeSort {
    private static void merge(int[] array, int l, int m, int r) {
        int size1, size2, i = 0, j = 0;
        int[] leftArray, rightArray;
        size1 = m - l + 1;
        size2 = r - m;
        leftArray = new int[size1];
        rightArray = new int[size2];

        for (int k = 0; k < size1; k++) {
            leftArray[k] = array[l + k];
        }
        for (int z = 0; z < size2; z++) {
            rightArray[z] = array[m + 1 + z];
        }

        int x = l;
        while (i < size1 && j < size2) {
            if (leftArray[i] < rightArray[j]) {
                array[x] = leftArray[i];
                i++;
            } else {
                array[x] = rightArray[j];
                j++;
            }
            x++;
        }
        while (i < size1) {
            array[x] = leftArray[i];
            i++;
            x++;
        }
        while (j < size2) {
            array[x] = rightArray[j];
            j++;
            x++;
        }

    }

    public static void sort(int[] array, int l, int r) {
        int m = l + (r - l) / 2;
        if (l < r) {
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }
}
