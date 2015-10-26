package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2015/3/14.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        int temp;
        for(int i = start, j = end; i < j; i ++, j --) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(nums, 10);
        for (int i : nums) {
            System.out.println(i);
        }
    }

}
