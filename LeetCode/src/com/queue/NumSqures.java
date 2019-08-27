package com.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 示例 1:
 *
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 */
public class NumSqures {
    public int numSquares(int n) {
        if(n == 0)
            return 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int step = 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                int head = queue.poll();
                for(int j = (int) Math.sqrt(head); j > 0; j--)
                {
                    if(j * j == head)
                    {
                        return step + 1;
                    }
                    else
                    {
                        queue.add(head - j * j);
                    }
                }
            }
            step++;
        }
        return 0;
    }
}
