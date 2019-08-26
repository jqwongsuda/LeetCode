package com.queue;

class numIslandTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void numIslands() {
        char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        NumIsland tmp = new NumIsland();
        int res = tmp.numIslands(grid);
        System.out.println("grid总共有" + res + "个岛屿！");
        char[][] grid1 = new char[][]{{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        NumIsland tmp1 = new NumIsland();
        int res1 = tmp.numIslands(grid1);
        System.out.println("gred1总共有" + res1 + "个岛屿！");
    }
}