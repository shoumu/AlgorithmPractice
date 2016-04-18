package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/4/15.
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int zeroCount = 0;
        while (n >= 5) {
            zeroCount += n / 5;
            n /= 5;
        }
        return zeroCount;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        System.out.println(factorialTrailingZeroes.trailingZeroes(1808548329));
        System.out.println(factorialTrailingZeroes.trailingZeroes(10));
    }

}
