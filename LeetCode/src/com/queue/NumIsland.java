package com.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumIsland {

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
        {
            return 0;
        }
        int res = 0;
        Boolean[][] flag = new Boolean[grid.length][grid[0].length];
        for(Boolean[] flags : flag)
        {
            Arrays.fill(flags,false);
        }
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] != '1' || flag[i][j] == true)
                    continue;
                res++;
                Queue<Integer> queue = new LinkedList();
                queue.add(i);
                queue.add(j);
                flag[i][j] = true;

                while(!queue.isEmpty())
                {
                    var x = queue.poll();
                    var y = queue.poll();
                    if(x + 1 < grid.length && grid[x+1][y] == '1' && flag[x+1][y] == false)
                    {
                        queue.add(x+1);
                        queue.add(y);
                        flag[x+1][y] = true;
                    }
                    if(x-1>=0 && grid[x-1][y] == '1' && flag[x-1][y] == false)
                    {
                        queue.add(x-1);
                        queue.add(y);
                        flag[x-1][y] = true;

                    }
                    if(y+1 < grid[0].length && grid[x][y+1] == '1' && flag[x][y+1] == false)
                    {
                        queue.add(x);
                        queue.add(y+1);
                        flag[x][y+1] = true;

                    }
                    if(y-1>=0 && grid[x][y-1] == '1' && !flag[x][y - 1])
                    {
                        queue.add(x);
                        queue.add(y-1);
                        flag[x][y-1] = true;

                    }

                }
            }
        }
        return res;

    }
}
