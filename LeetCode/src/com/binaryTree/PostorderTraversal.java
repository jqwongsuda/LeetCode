package com.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 后序遍历
 */
public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.addAll(postorderTraversal(root.left));
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }
}
