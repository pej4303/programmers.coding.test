package com.study.programmers.coding.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShuffleStrTest {
    @Test
    void test1() {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String result = "ababababab";

        ShuffleStr s = new ShuffleStr();
        assertEquals(result, s.solution(str1, str2));

    }
}