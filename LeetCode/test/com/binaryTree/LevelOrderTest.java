package com.binaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class LevelOrderTest {

    LevelOrder levelOrder = new LevelOrder();
    TreeNode root = new TreeNode(3);
    @BeforeEach
    void setUp() {
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(17);

        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;

    }


    @Test
    void inorderTraversal() {
        List<List<Integer>> lists = levelOrder.levelOrder(root);
        System.out.println("树的结构： \r\n" + root);
        System.out.println("树的层序遍历：");
        for (List<Integer> i:lists) {

            System.out.println(i);
        }
    }
}