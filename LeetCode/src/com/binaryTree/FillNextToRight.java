package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  填充每个节点的下一个右侧节点指针
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有 next 指针都被设置为 NULL。
 *
 *
 */
public class FillNextToRight {
    public Node connect(Node root) {
        if(root == null)
            return null;
        Node left = root.left;
        Node right = root.right;

        while(left != null){
            left.next = right;
            left = left.right;
            right = right.left;
        }
        connect(root.left);
        connect(root.right);

        return root;
    }
    public Node connectBFS(Node root)
    {
        if(root == null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node tmp;

        int size;
        while(!queue.isEmpty())
        {
            size = queue.size();
            Node head = new Node();
            for (int i = 0; i < size; i++) {

                tmp = queue.poll();
                head.next = tmp;
                head = tmp;
                if(tmp.left != null)
                    queue.add(tmp.left);
                if(tmp.right != null)
                    queue.add(tmp.right);
            }
        }
        return root;
    }
}
