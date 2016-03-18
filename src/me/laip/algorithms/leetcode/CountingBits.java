package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/18.
 * leetcode 338
 */
public class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int tmp = 1;
        result[0] = 0;
        for (int i = 1; i <= num; i ++) {
            if (i == tmp) {
                result[i] = 1;
                tmp *= 2;
            } else {
                result[i] = result[i - tmp / 2] + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 7;
        for (int i : new CountingBits().countBits(num)) {
            System.out.print(i + "\t");
        }
    }

}
