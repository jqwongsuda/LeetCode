package com.dynamicProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {
    PascalTriangle pascalTriangle;
    int rowIndex;
    @BeforeEach
    void setUp() {
        pascalTriangle = new PascalTriangle();
        rowIndex = 5;
    }

    @Test
    void getRow() {
        System.out.println("杨辉三角的第" + rowIndex + " 行：" + pascalTriangle.getRow(5));
    }
}