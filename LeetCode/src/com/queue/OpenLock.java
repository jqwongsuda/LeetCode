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
        //用来将数字转换为char的查询表
        char[] pos = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Set<String> set = new HashSet<>(Arrays.asList(deadends));
        LinkedList<String> list = new LinkedList<>();
        if (target == null || target.length() == 0 || set.contains("0000"))
            return -1;
        list.add("0000");
        int depth = 0;
        //广度优先遍历
        while (!list.isEmpty()) {
            int size = list.size();
            //System.out.println("当前队列长度：" + size);
            while (size-- > 0) {
                String str = list.removeFirst();
                if (str.equals(target)) {
                    return depth;
                }
                if (!set.contains(str)) {
                    set.add(str);
                    list.addAll(getNextList(str, pos));
                }
            }
            //每一层遍历完，深度加一
            depth++;
        }
        return -1;
    }

    private List<String> getNextList(String str, char[] pos) {
        List<String> res = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - '0';
            char[] newChars = chars.clone();
            newChars[i] = pos[(num + 11) % 10];     //数字加一
            res.add(new String(newChars));
            newChars[i] = pos[(num + 9) % 10];      //数字减一
            res.add(new String(newChars));
        }
        return res;
    } 
}
