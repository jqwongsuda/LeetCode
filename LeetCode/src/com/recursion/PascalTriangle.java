package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        lists.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{1})) );
        if(numRows == 1) return lists;
        lists.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{1,1})) );
        if(numRows == 2) return lists;
        for(int i = 2; i < numRows; i++)
        {
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for(int j = 1; j < i; j++)
            {
                tmp.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
            }
            tmp.add(1);
            lists.add(tmp);
        }

        return lists;
    }

}
