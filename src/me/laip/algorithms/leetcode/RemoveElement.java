package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/15.
 * leetcode 27
 */
class RemoveElement  {

    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != val) {
                nums[len ++] = nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4};
        int val = 5;
        System.out.println(new RemoveElement().removeElement(nums, val));
    }

}
