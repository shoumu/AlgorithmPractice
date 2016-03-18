package me.laip.algorithms.leetcode;

/**
 * Created by Huayra on 16/3/19.
 * leetcode 26
 */
public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int len = 0;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        RemoveDuplicate test = new RemoveDuplicate();
        System.out.println(test.removeDuplicates(nums));
    }

}
