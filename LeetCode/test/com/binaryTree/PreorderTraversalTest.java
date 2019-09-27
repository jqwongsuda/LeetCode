package com.binaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {
    PreorderTraversal preorderTraversal = new PreorderTraversal();
    TreeNode treeNode = new TreeNode(1);
    @BeforeEach
    void setUp() {
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
    }

    @Test
    void preorderTraversal() {
        List<Integer> list = preorderTraversal.preorderTraversal(treeNode);
        System.out.println("树的结构： \r\n" + treeNode );
        System.out.println("树的前序遍历：");
        for (int i:list) {
            System.out.println(i);
        }
    }
}