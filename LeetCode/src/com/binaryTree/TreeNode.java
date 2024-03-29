package com.binaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", " + val + ".left=" + left +
                ", " + val + ".right=" + right +
                '}';
    }

}
