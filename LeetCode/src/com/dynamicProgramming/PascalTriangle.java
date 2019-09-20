package com.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        Integer[] arr = new Integer[rowIndex + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        List<Integer> list = Arrays.asList(arr);
        list.set(0,1);
        for(int i = 1; i <= rowIndex; i++)
        {
            for(int j = i; j > 0; j--)
            {
                list.set(j,list.get(j-1) + list.get(j));
            }
        }
        return list;
    }

}
