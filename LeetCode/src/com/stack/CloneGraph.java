package com.stack;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}
    private Set<Node> set = new HashSet<>();
    @Override
    public String toString() {
        String res = "";
        for(Node n:neighbors)
        {
            if(!set.contains(this))
            {
                set.add(this);
                res += "Node{" +
                        "val=" + val +
                        ", neighbors=" + neighbors +
                        '}';
            }
            else
                res += val;
//            System.out.println(res);
        }
        return res;

    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
public class CloneGraph {


    Map<Node,Node> map = new HashMap<>();


    public Node cloneGraph(Node node) {
        if(null == node)
            return node;
        System.out.println("正在克隆第" + node.val + "个：");
        map.put(node,new Node(node.val, new ArrayList<>()));
        for(Node n : node.neighbors)
        {
            if(map.containsKey(n))
            {
                map.get(node).neighbors.add(map.get(n));
                System.out.println("    添加 " + n.val + " 到第" + node.val + "个；");
            }
            else
            {
                map.get(node).neighbors.add(cloneGraph(n));
                System.out.println("    添加 " + n.val + " 到第" + node.val + "个。");
            }
        }
        return map.get(node);
    }

}
