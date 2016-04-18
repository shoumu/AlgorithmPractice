package me.laip.algorithms.leetcode;

import jdk.nashorn.internal.ir.BinaryNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arthur on 2016/4/15.
 */
public class BinaryTreeLevelTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<TreeNode> cur = new ArrayList<TreeNode>();
        cur.add(root);
        List<TreeNode> next;
        if (root == null) {
            return result;
        }
        while (cur.size() > 0) {
            List<Integer> levelNums = new ArrayList<Integer>();
            next = new ArrayList<TreeNode>();
            for (TreeNode node : cur) {
                levelNums.add(node.val);
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            cur = next;
            result.add(levelNums);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        BinaryTreeLevelTraversal binaryTreeLevelTraversal = new BinaryTreeLevelTraversal();
        System.out.println(binaryTreeLevelTraversal.levelOrder(root));
    }

}


class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}
