package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/24.
 * leetcode 117
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 */
public class PopulatingNextRightPointers2 {

    public void connect(TreeLinkNode root) {
        TreeLinkNode node = root;
        while (node != null) {
            TreeLinkNode nextHead = new TreeLinkNode(0);
            TreeLinkNode nextTail = nextHead;
            for (TreeLinkNode tmp = node; tmp != null; tmp = tmp.next) {
                if (tmp.left != null) {
                    nextTail.next = tmp.left;
                    nextTail = nextTail.next;
                }
                if (tmp.right != null) {
                    nextTail.next = tmp.right;
                    nextTail = nextTail.next;
                }
            }
            node = nextHead.next;
        }
    }

    public static void main(String[] args) {
        TreeLinkNode node1 = new TreeLinkNode(1);
        TreeLinkNode node2 = new TreeLinkNode(2);
        TreeLinkNode node3 = new TreeLinkNode(3);
        TreeLinkNode node4 = new TreeLinkNode(4);
        TreeLinkNode node5 = new TreeLinkNode(5);
        TreeLinkNode node7 = new TreeLinkNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node7;
        new PopulatingNextRightPointers2().connect(node1);
        System.out.println("hello");
    }

}



//Definition for binary tree with next pointer.
class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}

