package com.study.programmers.coding.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OverwriteStrTest {
    @Test
    void test1() {
        String myStr = "He11oWor1d";
        String overwriteStr = "lloWorl";
        int n = 2;
        String result = "HelloWorld";   // 결과값

        OverwriteStr test = new OverwriteStr();

        assertEquals(test.solution(myStr, overwriteStr, n), result);
    }

    @Test
    void test2() {
        String myStr = "Program29b8UYP";
        String overwriteStr = "merS123";
        int n = 7;
        String result = "ProgrammerS123";   // 결과값

        OverwriteStr test = new OverwriteStr();

        assertEquals(test.solution(myStr, overwriteStr, n), result);
    }
}