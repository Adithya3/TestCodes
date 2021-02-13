package firstTry.leetcode.interview.sortingSearching;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

import java.util.Arrays;

public class MergeSort {

    public static void mergeCopied(int[] nums1, int m, int[] nums2, int n) {
        //we use m and n as the index for the current elements we want to compare from nums1 and nums2
        m--;
        n--;
        // 'i' is our index for the final positions in nums1
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (n < 0) {
                // this means that we finished adding all the elements from the nums2 array to nums1
                // and that we can return safely, since the elements from the nums1 array are already sorted and in place

                return;
            }
            // we look for the current highest number so that we can add it to the back of the array in its final position
            // if m<0 it means that only the elements from nums2 have been left to be added to nums1
            // so m>=0 means that we still need to do the compares to decide which number to move
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }

    public static void merge(int[] nums1, int[] nums2, int n, int m) {
        int firstPointer = 0, secondPointer = 0;
        int[] result = new int[n + m];
        for (int i = 0; i < n + m; i++) {
            if ((nums1[firstPointer] <= nums2[secondPointer]) && firstPointer < m) {
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
        merge(new int[]{1, 2, 3, 0, 0, 0}, new int[]{2, 5, 6}, 3, 3);
    }
}
