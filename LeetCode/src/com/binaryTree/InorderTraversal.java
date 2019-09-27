package com.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));
        return res;
    }

}
