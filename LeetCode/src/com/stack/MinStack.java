package com.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    /** initialize your data structure here. */
    private List<Integer> dataList;
    public MinStack() {
        dataList = new ArrayList<>();
    }

    public void push(int x) {
        dataList.add(x);
    }

    public void pop() {
        if(dataList.size() == 0)
            return;

        dataList.remove(dataList.size() - 1);
    }

    public int top() {
        if(dataList.size() == 0)
            return 0;
        return dataList.get(dataList.size() - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < dataList.size(); i++)
        {
            if(dataList.get(i) < min)
                min = dataList.get(i);
        }
        return min;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */