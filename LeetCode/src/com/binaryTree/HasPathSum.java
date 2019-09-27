package com.binaryTree;

/**
 *路径总和等于输入参数
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null && sum == root.val)
            return true;

        return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
    }
}
