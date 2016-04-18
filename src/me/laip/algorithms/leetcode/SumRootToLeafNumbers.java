package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/4/16.
 */
public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode node, int num) {
        int result = 0;
        if (node != null) {
            num = 10 * num + node.val;
        }
        if (node == null) {
            return 0;
        }
        else if (node.left == null && node.right == null) {
            result = num;
        } else {
            if (node.left != null) {
                result += helper(node.left, num);
            }
            if (node.right != null) {
                result += helper(node.right, num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        System.out.println(sumRootToLeafNumbers.helper(root, 0));
    }

}
