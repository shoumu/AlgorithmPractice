package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2015/3/12.
 */
public class HammingWeight {

    public int hammingWeight(long n) {
        int num = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                num ++;
            }
            n = n >> 1;
        }
        return num;
    }

    public static void main(String[] args) {
        long num = 2147483648L;
        System.out.println(new HammingWeight().hammingWeight(num));
    }

}
