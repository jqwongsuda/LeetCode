package com.queue;

import java.util.*;

public class OpenLock {

    /**
     * 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。
     * 每个拨轮可以自由旋转：例如把 '9' 变为  '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
     * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
     * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
     * 字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。
     * @param deadends
     * @param target
     * @return
     */
    public int openLock(String[] deadends, String target) {
        List<String> deadsList = Arrays.asList(deadends);
        if(target == "0000")
        {
            return 0;
        }
        if(deadsList.contains(target))
        {
            return -1;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> used = new HashSet<>();
        queue.add(Integer.parseInt(target));//添加头结点
        used.add(Integer.parseInt(target));//已使用字符串添加进哈希表
        int step = 0;//循环的层数，也就是可以到达目标地最短步数
        int floorLast = Integer.parseInt(target);//第一层的最后一个元素，之后代表每一层的最后一个元素
        while(!queue.isEmpty())
        {
            int head = queue.poll();//将队头弹出并保存值
//            if(head == 0)
//            {
//                return step;
//            }
            int[] neighbors = neighbor(head);//计算得到8个邻居
            for(int i = 0; i < neighbors.length; i++)
            {
                if(used.contains(neighbors[i]) || deadsList.contains(neighbors[i]))//如果已经使用过或者属于死锁，则跳过
                {
                    continue;
                }
                if(neighbors[i] == 0)//如果遇到‘0000’，直接返回step+1，多加的1是因为这一层还没结束step还没自增
                {
                    return step + 1;
                }
                queue.add(neighbors[i]);
                used.add(neighbors[i]);
            }
            if(head == floorLast)//如果弹出的队头元素是上一层的最后一个节点，则步数加一，更新floorLast为当前层的最后一个
            {
//                System.out.println("第" + step + "层：\r\n");
//                for(int tmp : queue)
//                {
//                    System.out.print(tmp);
//                    System.out.print(" ");
//                }
                step++;
                floorLast = neighbors[neighbors.length - 1];
            }
        }


        return -1;
    }
    public int[] neighbor(int str)
    {
        int[] res = new int[8];
        int a = str % 10;
        int b = str / 10 % 10;
        int c = str / 100 % 10;
        int d = str / 1000;
        res[0] = (d + 1)%10 * 1000 + c * 100 + b * 10 + a;
        res[1] = (d - 1 + 10)%10 * 1000 + c * 100 + b * 10 + a;
        res[2] = d * 1000 + (c + 1)%10 * 100 + b * 10 + a;
        res[3] = d * 1000 + (c - 1 + 10)%10 * 100 + b * 10 + a;
        res[4] = d * 1000 + c * 100 + (b + 1)%10 * 10 + a;
        res[5] = d * 1000 + c * 100 + (b - 1 + 10)%10 * 10 + a;
        res[6] = d * 1000 + c * 100 + b * 10 + (a + 1)%10;
        res[7] = d * 1000 + c * 100 + b * 10 + (a - 1 + 10)%10;
        return res;
    }

}
