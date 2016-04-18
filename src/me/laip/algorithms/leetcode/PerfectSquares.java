package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/4/16.
 */
public class PerfectSquares {

    public int numSquares(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        for (int i = 1; i <= n; i ++) {
            arr[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j * j <= i; j ++) {
                arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
            }
        }
        return arr[n];
    }

    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        System.out.println(perfectSquares.numSquares(12));
        System.out.println(perfectSquares.numSquares(5));
    }

}
