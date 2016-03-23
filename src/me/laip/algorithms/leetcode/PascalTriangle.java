package me.laip.algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arthur on 2016/3/20.
 * leetcode 118
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> aboveRowList = null;
        for (int i = 0; i < numRows; i ++) {
            List<Integer> tmpList = new ArrayList<Integer>();
            tmpList.add(1);
            if (aboveRowList != null) {
                for (int j = 1; j < aboveRowList.size(); j ++) {
                    tmpList.add(aboveRowList.get(j - 1) + aboveRowList.get(j));
                }
                tmpList.add(1);
            }
            result.add(tmpList);
            aboveRowList = tmpList;
        }
        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(new PascalTriangle().generate(numRows));
    }

}
