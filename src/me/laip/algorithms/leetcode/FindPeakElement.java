package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/23.
 * leetcode 162
 * https://leetcode.com/problems/find-peak-element/
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int findPeakElement2(int[] nums) {
        int start = 0, end = nums.length - 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

}
