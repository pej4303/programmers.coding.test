package com.study.programmers.coding.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrToListTest {

    @Test
    void solution() {
        StrToList s = new StrToList();

        String[] arr = new String[]{"a", "b", "c"};
        String result = "abc";

        assertEquals(result, s.solution(arr));
    }
}