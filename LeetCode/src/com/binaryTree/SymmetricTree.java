package com.binaryTree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return false;
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode node1, TreeNode node2)
    {
        if(node1 == null && node2 == null)
            return true;
        if(node1 == null || node2 == null)
            return false;
        return (node1.val == node2.val)
                && helper(node1.left, node2.right)
                && helper(node1.right, node2.left);
    }
}
