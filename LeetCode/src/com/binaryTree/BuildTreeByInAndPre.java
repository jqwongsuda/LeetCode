package com.binaryTree;

import java.util.Arrays;

/**
 * 从前序与中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class BuildTreeByInAndPre {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;

        assert inLen == preLen;

        if(inLen == 0)
            return null;
        if(inLen == 1)
            return new TreeNode(inorder[0]);

        //构建父节点
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);

        //找出该节点在中序遍历中的位置
        int index = 0;
        for (int i = 0; i < inLen; i++) {
            if(inorder[i] == rootVal)
            {
                index = i;
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder,1,index + 1),Arrays.copyOfRange(inorder,0,index));
        root.right = buildTree(Arrays.copyOfRange(preorder,index+1,preLen),Arrays.copyOfRange(inorder,index+1,inLen));

        return root;
    }
}
