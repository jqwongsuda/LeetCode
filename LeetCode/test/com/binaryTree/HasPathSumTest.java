package com.binaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasPathSumTest {

    HasPathSum hasPathSum = new HasPathSum();
    int sum = 22;
    TreeNode root = new TreeNode(5);

    @BeforeEach
    void setUp() {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(1);




        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.right = node8;

    }

    @Test
    void hasPathSum() {
        boolean b = hasPathSum.hasPathSum(root,22);
        System.out.println("树的结构： \r\n" + root);
        System.out.println("树存在路径相加得到" + sum + "?" + b);
    }
}