package random;

public class BinarySearch {
    private static boolean binarySearch(int[] sortedArray, int searchValue) {
        int startIndex = 0, endIndex = sortedArray.length - 1;
        if ((searchValue == sortedArray[startIndex]) || (searchValue == sortedArray[endIndex])) {
            return true;
        }
        while ((endIndex - startIndex) > 1) {
            if (sortedArray[((startIndex + endIndex) / 2)] > searchValue) {
                endIndex = ((startIndex + endIndex) / 2);
            } else if (sortedArray[((startIndex + endIndex) / 2)] < searchValue) {
                startIndex = ((startIndex + endIndex) / 2);
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearchMid(int[] sortedArray, int searchValue) {
        int startIndex = 0, lastIndex = sortedArray.length - 1, MidIndex;
        return false;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 3, 4, 5, 6, 7, 8, 11, 34, 55, 68, 69, 99};
        System.out.println(binarySearch(testArray, -4));
    }
}
