package com.ajelimalai.leetcode.problems;

public class Median2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int middle = totalLength / 2;
        boolean isEven = (totalLength % 2) == 0;
        int i1 = 0, i2 = 0;
        int element = 0;
        int prevElement = 0;
        for (int i = 0; i <= middle; i++) {
            prevElement = element;
            if (i1 == nums1.length) {
                element = nums2[i2];
                i2++;
            } else if (i2 == nums2.length) {
                element = nums1[i1];
                i1++;
            } else if (nums1[i1] <= nums2[i2]) {
                element = nums1[i1];
                i1++;
            } else {
                element = nums2[i2];
                i2++;
            }
        }

        if (isEven) {
            return (prevElement + element) / 2.0;
        } else {
            return element;
        }
    }
}
