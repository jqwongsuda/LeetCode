package com.binaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class PostorderTraversalTest {
    PostorderTraversal postorderTraversal = new PostorderTraversal();
    TreeNode treeNode = new TreeNode(1);
    @BeforeEach
    void setUp() {
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
    }
    @Test
    void postorderTraversal() {
        List<Integer> list = postorderTraversal.postorderTraversal(treeNode);
        System.out.println("树的结构： \r\n" + treeNode );
        System.out.println("树的后序遍历：");
        for (int i:list) {
            System.out.println(i);
        }
    }
}