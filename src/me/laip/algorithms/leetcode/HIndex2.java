package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/24.
 * leetcode 275
 * https://leetcode.com/problems/h-index-ii/
 */
public class HIndex2 {

    public int hIndex(int[] citations) {
        int start = 0;
        int end = citations.length - 1;
        int result = 0;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (citations[mid] >= citations.length - mid) {
                result = citations.length - mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }

}
