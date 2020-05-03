package leetcode.interview.sortingSearching;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] nums1, int[] nums2, int n, int m) {
        int firstPointer = 0, secondPointer = 0;
        int[] result = new int[n + m];
        for (int i = 0; i < n + m; i++) {
            if ((nums1[firstPointer] <= nums2[secondPointer])) {
                result[i] = nums1[firstPointer];
                firstPointer++;
            } else {
                result[i] = nums2[secondPointer];
                secondPointer++;
            }
        }
        nums1 = result;
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, new int[]{2,5,6}, 3, 3);
    }
}
