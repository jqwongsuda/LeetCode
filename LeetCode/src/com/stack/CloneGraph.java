package com.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", neighbors=" + neighbors +
                '}';
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
        map.put(node,new Node(node.val, new ArrayList<>()));
        for(Node n : node.neighbors)
        {
            if(map.containsKey(n))
            {
                map.get(node).neighbors.add(n);
            }
            else
            {
                map.get(node).neighbors.add(cloneGraph(n));
            }
        }
        return map.get(node);
    }
    public Node cloneGraph1(Node node){
        if(null == node)
            return node;
        Node newNode = new Node(node.val,new ArrayList<>());
        for(Node n : node.neighbors)
        {
            newNode.neighbors.add(cloneGraph1(n));
        }
        return newNode;
    }
}
