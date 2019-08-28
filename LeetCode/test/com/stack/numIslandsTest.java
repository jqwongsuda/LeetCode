package com.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

class numIslandsTest {
    private char[][] grid;
    private NumIslands numIslands;
    @BeforeEach
    void setUp() {
        grid = new char[][]{{'1','1','0','0','0'},
                {'1','1','0','1','0'},
                {'0','0','1','0','0'},
                {'0','0','0','0','0'}};
        numIslands = new NumIslands();
    }

    @Test
    void numIslands() {
        System.out.println("岛屿矩阵为" );
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("岛屿数量为：" + numIslands.numIslands(grid));
    }
}