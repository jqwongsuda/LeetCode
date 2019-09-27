package com.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> resList = new ArrayList<>();
        resList.add(root.val);
        resList.addAll(preorderTraversal(root.left));
        resList.addAll(preorderTraversal(root.right));
        return resList;
//        if(root.left == null && root.right == null)
//        {
//            return resList;
//        }
//        if(root.left != null)
    }
}
