package com.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidBracketTest {
    ValidBracket validBracket = new ValidBracket();
    @Test
    void isValid() {
        String str1 = "(())[]{}{}";
        String str2 = "()()()(}{";
        System.out.println(str1 + "是有效字符串吗？：" + validBracket.isValid(str1));
        System.out.println(str2 + "是有效字符串吗？：" + validBracket.isValid(str2));

    }
}