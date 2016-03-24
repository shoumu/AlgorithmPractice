package me.laip.algorithms.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Arthur on 2016/3/24.
 * leetcode 215
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargesttElementInArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>(k);
        for (int num : nums) {
            if (priorityQueue.size() == k) {
                if (priorityQueue.peek() < num) {
                    priorityQueue.poll();
                    priorityQueue.add(num);
                }
            }
            else {
                priorityQueue.add(num);
            }
        }
        return priorityQueue.peek();
    }

//    public int findKthLargest3(int[] nums, int k) {
//
//    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(new KthLargesttElementInArray().findKthLargest2(nums, 2));
    }

}
