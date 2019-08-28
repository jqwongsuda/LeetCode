package com.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CloneGraphTest {
    Node node1;
    Node node2;
    Node node3;
    Node node4;
    CloneGraph cloneGraph = new CloneGraph();
    @BeforeEach
    void setUp() {
        node1 = new Node(1,new ArrayList<>());
        node2 = new Node(2,new ArrayList<>());
        node3 = new Node(3,new ArrayList<>());
        node4 = new Node(4,new ArrayList<>());
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node3);
        node4.neighbors.add(node1);

//        node = new Node(1,new ArrayList<Node>(node2 = new Node(2,new ArrayList<Node>(node,
//                node3 = new Node(3,new ArrayList<Node>(node2,node4 = new Node(4,new ArrayList<Node>(node3,node))))))));
    }

    @Test
    void cloneGraph() {
        Node n = cloneGraph.cloneGraph(node1);

        for(Node no : n.neighbors)
        {
            System.out.println(no.val);
        }
    }
    private void cloneTestHelper(Node node)
    {
        System.out.println(node);
    }
}