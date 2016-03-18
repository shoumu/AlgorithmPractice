package me.laip.algorithms.leetcode;

/**
 * Created by Huayra on 16/3/19.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        for (; len >= 0; len --) {
            digits[len] += 1;
            if (digits[len] == 10) {
                digits[len] = 0;
            } else {
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}
