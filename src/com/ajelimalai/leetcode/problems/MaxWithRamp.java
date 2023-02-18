package com.ajelimalai.leetcode.problems;

/**
 * A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such a ramp is j - i.
 * <p>
 * Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in nums, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [6,0,8,2,1,5]
 * Output: 4
 * Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
 * Example 2:
 * <p>
 * Input: nums = [9,8,1,0,1,9,4,0,4,1]
 * Output: 7
 * Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.
 */
public class MaxWithRamp {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1};
        System.out.println(maxWidthRamp(nums));
    }

    public static int maxWidthRamp(int[] nums) {
        for (int k = nums.length - 1; k > 0; k--) {
            for (int i = 0; i + k < nums.length; i++) {
                int j = i + k;
                System.out.println("i= " + i + "j=" + j);
                if (nums[i] <= nums[j]) {
                    return j - i;
                }

            }
        }

        return 0;
    }
}
