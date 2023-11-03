package com.study.programmers.coding.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    @DisplayName("등차수열")
    void test1() {
        int result = 37;
        int a = 3;
        int d = 4;
        boolean[] included = new boolean[]{true, false, false, true, true};

        int[] arr = IntStream.iterate(a, i -> i + d).limit(included.length).toArray();

        int sum = 0;

        for (int i=0; i<included.length; i++) {
            if (included[i]) {
                sum += arr[i];
            }
        }

        assertEquals(result, sum);
    }

    @Test
    void test2() {
        String result = "acbac";
        String code = "abc1abc1abc";
        int mode = 0;

        String answer = "";
        String[] arr = code.split("");
        String pattern = "^[a-z1]+$";
        /**
         * 제한사항
         *  1 ≤ code의 길이 ≤ 100,000
         *  code는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.
         */
        if ( 1<= code.length() && code.length() <= 100000 && Pattern.matches(pattern, code)) {
            for (int i=0; i<arr.length; i++) {
                switch (mode) {
                    case 0:
                        if ( arr[i].equals("1") ) {
                            mode = 1;
                        } else {
                            if ( i % 2 == 0 ) {
                                answer += arr[i];
                            }
                        }
                        break;
                    case 1:
                        if ( arr[i].equals("1") ) {
                            mode = 0;
                        } else {
                            if ( i % 2 != 0 ) {
                                answer += arr[i];
                            }
                        }
                        break;
                }
            }
        }

        assertEquals(result, answer);
    }
}
