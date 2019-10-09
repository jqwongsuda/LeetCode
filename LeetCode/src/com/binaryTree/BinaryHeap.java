package com.binaryTree;

import java.util.Arrays;

public class BinaryHeap {
    /**
     * 上浮调整
     * @param array 待调整的堆
     */
    public static void upAdjust(int[] array){
        int childIndex = array.length-1;
        int parentIndex = (childIndex-1)/2;
        //temp保存插入的叶子节点值，用于最后的赋值
        int temp = array[childIndex];
        while(childIndex > 0 && temp < array[parentIndex])
        {
            //无需真正交换，单向赋值季可
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1)/2;
        }
        array[childIndex] = temp;
    }

    /**
     * 下沉 调整
     * @param array          待调整的堆
     * @param parentIndex    要下沉的父节点
     * @param length         堆的有效大小
     */
    public static void downAdjust(int[] array, int parentIndex, int length){
        //temp 保存父节点的值，用于最后赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;//左叶子下标
        while(childIndex <  length){
            //记录最小孩子坐标
            //如果有 右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if(childIndex + 1 < length && array[childIndex + 1] < array[childIndex])
                childIndex++;
            //如果父节点小于任何一个孩子的值，则直接跳出
            if(temp <= array[childIndex])
                break;

            //如果父节点比左右孩子都大，则与最小孩子互换）
            array[parentIndex] = array[childIndex];
            //（不是直接互换，直接将最小孩子赋值给父节点，父节点下标指向最小孩子
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    /**
     * 构建堆
     * @param array 待调整的堆
     */
    public static void buildHeap(int[] array){
        //从最后一个非叶子节点开始，依次左“下沉”调整
        for(int i = (array.length - 2)/2; i>=0; i--){
            downAdjust(array,i, array.length);
        }
    }

    public static void main(String[] args){
        int[] array = new int[] {1,3,2,6,5,7,8,9,10,0};
        System.out.println("上浮调整前：" + Arrays.toString(array));
        upAdjust(array);
        System.out.println("上浮调整后：" + Arrays.toString(array));


        array = new int[]{7,1,3,10,5,2,8,9,6};
        System.out.println("下沉调整前：" + Arrays.toString(array));
        buildHeap(array);
        System.out.println("下沉调整后：" + Arrays.toString(array));

        array = new int[]{3,8,5,10,12,4,17,21,32,80,9};
        System.out.println("下沉调整前：" + Arrays.toString(array));
        buildHeap(array);
        System.out.println("下沉调整后：" + Arrays.toString(array));
    }
}
