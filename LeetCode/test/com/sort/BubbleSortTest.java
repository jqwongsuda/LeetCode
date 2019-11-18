package com.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private int[] array = {2,3,4,5,6,7,1,8};
    @BeforeEach
    void setUp() {
        System.out.println("冒泡排序开始前数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\r\n");
    }

    @Test
    void sort_1() {
        int[] arr = this.array;
        System.out.println("普通冒泡:");
        BubbleSort.sort_1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\r\n");
    }

    @Test
    void sortOptimize_1() {
        int[] arr = this.array;
        System.out.println("冒泡优化一:");
        BubbleSort.sortOptimize_1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\r\n");    }

    @Test
    void sortOptimize_2() {
        int[] arr = this.array;
        System.out.println("冒泡优化二:");
        BubbleSort.sortOptimize_2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\r\n");    }

    @Test
    void sortCocktail() {
        int[] arr = this.array;
        System.out.println("鸡尾酒冒泡:");
        BubbleSort.sortCocktail(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\r\n");    }

    @Test
    void sortCocktailOptimize() {
        int[] arr = this.array;
        System.out.println("鸡尾酒冒泡优化:");
        BubbleSort.sortCocktailOptimize(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\r\n");    }
}