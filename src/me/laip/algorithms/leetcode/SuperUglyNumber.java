package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/20.
 * leetcode 313
 * https://leetcode.com/problems/super-ugly-number/
 */
public class SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] result = new int[n];
        int[] index = new int[primes.length];
        result[0] = 1;
        for (int i = 1; i < n; i ++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j ++) {
                if (result[index[j]] * primes[j] < min) {
                    min = result[index[j]] * primes[j];
                }
            }
            result[i] = min;
            for (int j = 0; j < primes.length; j ++) {
                while (result[index[j]] * primes[j] <= min) {
                    index[j] ++;
                }
            }
        }
        return result[n - 1];
    }

    public static void main(String[] args) {
        int[] primes = new int[]{2, 7, 13, 19};
        SuperUglyNumber superUglyNumber = new SuperUglyNumber();
        System.out.println(superUglyNumber.nthSuperUglyNumber(5, primes));
    }

}
