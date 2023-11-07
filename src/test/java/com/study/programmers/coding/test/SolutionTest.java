package com.study.programmers.coding.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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

    @Test
    @DisplayName("마지막 두 원소")
    void test3() {
        /**
         * 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
         * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
         */
        int[] num_list = new int[]{2, 1, 6};
        int[] result = new int[]{2, 1, 6, 5};

        int num1 = num_list[num_list.length - 1];
        int num2 = num_list[num_list.length - 2];

        int tmp = (num1 > num2) ? num1 - num2 : num1 * 2;

        // 원본 배열을 복사하여 새로운 배열을 생성
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        // 마지막 위치에 요소를 추가
        answer[num_list.length] = tmp;

        assertEquals(result[result.length-1], answer[answer.length-1]);
    }

    @Test
    void test4() {
        int n = 10;

        int[] arr = IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();

        Arrays.stream(arr).forEach(System.out::println);
    }

}
