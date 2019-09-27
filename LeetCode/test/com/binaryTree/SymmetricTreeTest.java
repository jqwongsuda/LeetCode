package com.binaryTree;
/**
 * 对称树
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    SymmetricTree symmetricTree = new SymmetricTree();
    TreeNode root = new TreeNode(0);

    @BeforeEach
    void setUp() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(2);


        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

    }

    @Test
    void isSymmetric() {
        boolean b = symmetricTree.isSymmetric(root);
        System.out.println("树的结构： \r\n" + root);
        System.out.println("树是对称树？" + b);
    }
}