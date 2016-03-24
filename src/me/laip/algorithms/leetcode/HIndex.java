package me.laip.algorithms.leetcode;

import java.util.Arrays;

/**
 * Created by Arthur on 2016/3/24.
 * leetcode 274
 * https://leetcode.com/problems/h-index/
 */
public class HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max = 0, j, compare;
        for (int i = citations.length - 1; i >= 0; i --) {
            j = citations.length - i;
            compare = Math.min(j, citations[i]);
            max = Math.max(max, compare);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
//        int[] citations = {0, 1};
//        int[] citations = {100};
        System.out.println(new HIndex().hIndex(citations));
    }

}
