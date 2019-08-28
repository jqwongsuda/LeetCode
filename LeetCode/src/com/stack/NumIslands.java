package com.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * 岛屿数量
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
 * 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 */
public class NumIslands {
    public int numIslands(char[][] grid){
        if(grid.length == 0 || grid == null)
        {
            return 0;
        }
        Boolean[][] flag = new Boolean[grid.length][grid[0].length];
        for(Boolean[] flags : flag)
        {
            Arrays.fill(flags,false);
        }
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ++count;
                    dfs(grid, i, j);
                }

            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if(i-1>=0 && grid[i-1][j] == '1') dfs(grid,i - 1, j);
        if(i+1 < grid.length && grid[i+1][j] == '1') dfs(grid,i + 1, j);
        if(j-1>=0 && grid[i][j-1] == '1') dfs(grid,i, j-1);
        if(j+1>=0 && grid[i][j+1] == '1') dfs(grid,i, j+1);

    }
}
