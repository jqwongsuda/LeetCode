package com.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 基本冒泡排序
     * @param array
     */
    public static void sort_1(int array[])
    {
        int tmp = 0;
        for(int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    /**
     * 优化一：
     * 增加flag位，标识是否已经有序，若已经有序，则不必要继续进行比较了
     * @param array
     */
    public static void sortOptimize_1(int array[]){
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            //每一轮开始前 issorted 都是true
            boolean isSorted = true;

            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    //只要发生交换，则该数组还未有序
                    isSorted = false;
                }
            }
            //如果一轮下来没有发生交换，则表示数组已经有序，直接退出排序
            if(isSorted)
                break;
        }
    }

    /**
     * 优化二：
     * 记录最后一次交换的位置，设置有序区边界，已经有序的子数组不必继续比较
     * ！！！其实普通冒泡排序也有有序区这个概念，就是子循环中 j < array.length - i - 1,
     * ！！！此函数的sortBorder 针对的是大部分已经有序的情况
     * @param array
     */
    public static void sortOptimize_2(int array[]){
        int tmp = 0;
        //记录每一轮最后一次交换的位置下标
        int lastExchangeIndex = 0;
        //记录无序和有序区的边界下标，每次只需要比较到此处即可
        int sortBorder = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            //每一轮开始前 issorted 都是true
            boolean isSorted = true;

            for (int j = 0; j < sortBorder; j++) {
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    //只要发生交换，则该数组还未有序
                    isSorted = false;
                    //记录最后交换位置下标
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            //如果一轮下来没有发生交换，则表示数组已经有序，直接退出排序
            if(isSorted)
                break;
        }
    }
    /**
     * 鸡尾酒排序
     * 结合sort_2,并将冒泡排序的单向排序改为双向，即先从左到右，再从右到左
     * 适合：大部分代码已经有序的情况，比如{2，3，4，5，6，7，8，1，9}
     * 如果从左到右单向排序需要排7轮，但是双向排序的话只要3轮
     * 其实第二轮已经排好了，只不过有发生过交换，所以需要第三轮来确认是否已经有序
     * @param array
     */
    public static void sortCocktail(int array[])
    {
        int tmp = 0;
        //由于是向两边冒泡，所以第一层循环不用循环n 次
        for (int i = 0; i < array.length / 2; i++) {
            //从左往右，将 issorted 置为true
            boolean isSorted = true;
            //由于是向两边冒泡，所以最左边即是最小值，所以每次j 从 i 开始冒泡即可
            for (int j = i; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    //只要发生交换，则该数组还未有序
                    isSorted = false;
                }
            }
            //如果一轮下来没有发生交换，则表示数组已经有序，直接退出排序
            if(isSorted)
                break;

            //从左往右，将 issorted 置为true
            isSorted = true;

            for (int j = array.length - i - 2; j > i; j--) {
                if(array[j] < array[j - 1]){
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    //只要发生交换，则该数组还未有序
                    isSorted = false;
                }
            }
            //如果一轮下来没有发生交换，则表示数组已经有序，直接退出排序
            if(isSorted)
                break;
        }
    }

    /**
     * 鸡尾酒优化：
     * 添加有序区边界
     * @param array
     */
    public static void sortCocktailOptimize(int array[]){
        int tmp = 0;
        int lastExchangeIndex1 = 0;
        int lastExchangeIndex2 = 0;
        int leftBorder= 0;
        int rightBorder=array.length - 1;
        //由于是向两边冒泡，所以第一层循环不用循环n 次
        for (int i = 0; i < array.length / 2; i++) {
            //从左往右，将 issorted 置为true
            boolean isSorted = true;

            //由于是向两边冒泡，所以最左边即是最小值，所以每次j 从 i 开始冒泡即可
            for (int j = i; j < rightBorder; j++) {
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    //只要发生交换，则该数组还未有序
                    isSorted = false;
                    lastExchangeIndex1 = j;
                }
            }
            rightBorder = lastExchangeIndex1;
            //如果一轮下来没有发生交换，则表示数组已经有序，直接退出排序
            if(isSorted)
                break;

            //从左往右，将 issorted 置为true
            isSorted = true;

            for (int j = array.length - i - 2; j > leftBorder; j--) {
                if(array[j] < array[j - 1]){
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    //只要发生交换，则该数组还未有序
                    isSorted = false;
                    lastExchangeIndex2=j;
                }
            }
            leftBorder = lastExchangeIndex2;
            //如果一轮下来没有发生交换，则表示数组已经有序，直接退出排序
            if(isSorted)
                break;
        }
    }
}
