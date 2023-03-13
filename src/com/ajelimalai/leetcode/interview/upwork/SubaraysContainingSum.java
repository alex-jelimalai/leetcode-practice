package com.ajelimalai.leetcode.interview.upwork;

public class SubaraysContainingSum {

    int solution(int[] a, int m, int k) {
        int total = 0;
        int inx = 0;
        while (inx + m - 1 < a.length) {
            int windowEnd = inx + m - 1;
            int jInx = 0;
            boolean solutionFound = false;
            for (int i = inx; i < windowEnd; i++) {
                for (int j = jInx; j <= windowEnd && !solutionFound; j++) {
                    if (a[i] + a[j] == k) {
                        int skippedAndCounted = i - inx + 1;
                        skippedAndCounted = Math.min(skippedAndCounted, a.length - windowEnd);
                        total += skippedAndCounted;
                        inx += skippedAndCounted - 1;
                        solutionFound = true;
                    }
                }
                if (solutionFound) {
                    jInx = i + 2;
                } else {
                    jInx = windowEnd + 1;
                }
            }
            inx++;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(new SubaraysContainingSum().solution(new int[]{20, 30, 40, 20, 20, 20}, 5, 60));
    }
}
