package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {
    PascalTriangle pascalTriangle;
    int numRows;
    @BeforeEach
    void setUp() {
        pascalTriangle = new PascalTriangle();
        numRows = 5;
    }

    @Test
    void generate() {
        System.out.println(pascalTriangle.generate(5));
    }
}