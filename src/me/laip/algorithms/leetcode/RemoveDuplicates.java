package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/24.
 * leetcode 80
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int i, j;
        for (i = 2, j = i; j < nums.length;) {
            if (nums[j] == nums[i - 2]) {
                j ++;
            }
            else {
                nums[i ++] = nums[j ++];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));
    }

}
