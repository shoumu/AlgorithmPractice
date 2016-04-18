package me.laip.algorithms.leetcode;

/**
 * Created by Huayra on 16/4/18.
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
    }

}
