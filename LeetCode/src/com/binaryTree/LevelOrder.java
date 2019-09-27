package com.binaryTree;

import java.util.*;

/**
 * 层序遍历，即广度优先搜索
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resList = new ArrayList<List<Integer>>();

        int preCount = 1;
        int curCount = 0;
        TreeNode tmpNode = null;
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> tmpList = new ArrayList<>();
            //循环弹出某一层的节点，并添加下一层的节点
            for(int i = 0; i < preCount; i++)
            {
                tmpNode = queue.poll();
                tmpList.add(tmpNode.val);
                if(tmpNode.left!=null){
                    curCount++;
                    queue.add(tmpNode.left);
                }
                if(tmpNode.right!=null){
                    curCount++;
                    queue.add(tmpNode.right);
                }
            }
            preCount = curCount;
            curCount = 0;
            resList.add(tmpList);
        }
        return resList;
    }
}
