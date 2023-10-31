package com.study.programmers.coding.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEven2Test {

    @Test
    void solution() {
        int n = 10;
        int result = 220;

        OddEven2 s = new OddEven2();

        assertEquals(result, s.solution(n));
    }

    @Test
    void solution2() {
        int n = 7;
        int result = 16;

        OddEven2 s = new OddEven2();

        assertEquals(result, s.solution(n));
    }
}