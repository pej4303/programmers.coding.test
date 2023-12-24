package com.study.programmers.coding.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    @DisplayName("배열의 최빈값 구하기")
    void test4() {
        // 최빈값 : 최고 빈도
        int[] array = {80,80,9};
//        int[] array = {1, 1, 2, 2};
//        int[] array = {1};
//        int result = 3;
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Stream.of(map).forEach(System.out::println);

        // 최빈값 찾기
        int maxNum = Collections.max(map.values()).intValue();
        System.out.println("maxNum = " + maxNum);

        int dup = 0;
        for (int tmp : map.values()) {
            if (tmp == maxNum) {
                dup++;
            }
        }

        if (dup > 1) {
            answer = -1;
        } else {
            OptionalInt first = Arrays.stream(array).filter(i -> i == maxNum).findFirst();
            answer = first.getAsInt();
        }

        System.out.println("answer = " + answer);
    }

    @Test
    @DisplayName("배열의 최빈값 구하기2")
    void test5() {
        // 최빈값 : 최고 빈도
        int[] array = {80,80,9};
//        int[] array = {1, 1, 2, 2};
//        int[] array = {1};
//        int result = 3;
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Stream.of(map).forEach(System.out::println);

        // 최빈값 찾기
        int maxNum = Collections.max(map.values()).intValue();
        System.out.println("maxNum = " + maxNum);

        int dup = 0;
        for (int tmp : map.values()) {
            if (tmp == maxNum) {
                dup++;
            }
        }

        if (dup > 1) {
            answer = -1;
        } else {
            OptionalInt first = Arrays.stream(array).filter(i -> i == maxNum).findFirst();
            answer = first.getAsInt();
        }

        System.out.println("answer = " + answer);
    }

    @Test
    @DisplayName("최빈값 구하기2")
    void test7() {
//        int[] array = {80,80,9};
        int[] array = {1, 1, 2, 2};
//        int[] array = {1};
        int result = -1;
        int answer = 0;

        boolean isValidate = 0 < array.length && array.length < 100;

        if ( isValidate) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : array) {
                if ( 0 <= num && num < 1000) {
                    if (map.containsKey(num)) {
                        map.put(num, map.get(num) + 1);
                    } else {
                        map.put(num, 1);
                    }
                }
            }

            // 배열의 최빈값
            int maxNum = Collections.max(map.values()).intValue();

            // 최빈값이 여러개인지 확인
            int dup = 0;
            for (int tmp : map.values()) {
                if (tmp == maxNum) {
                    dup++;
                }
            }

            if (dup > 1) {
                answer = -1;
            } else {
                OptionalInt first = Arrays.stream(array).filter(i -> i == maxNum).findFirst();
                answer = first.getAsInt();
            }
        }

        assertEquals(answer, result);
    }

    @Test
    @DisplayName("최빈값 구하기3 - gpt")
    void test8() {
        int[] array = {1, 1, 2, 2};
//        int[] array = {1};
        int result = -1;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int answer = -1;
        int maxCount = 0;

        // countMap을 순회하면서 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int currentCount = entry.getValue();
            if (currentCount > maxCount) {
                maxCount = currentCount;
                answer = entry.getKey();
            } else if (currentCount == maxCount) {
                // 최빈값이 여러 개인 경우 -1 반환
                answer = -1;
            }
        }

        assertEquals(answer, result);
    }

    @Test
    @DisplayName("배열의 평균값 구하기")
    void test9() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = 5.5;

        double answer = Arrays.stream(array).average().orElse(0);

        assertEquals(answer, result);
    }

    @Test
    @DisplayName("가격 구하기")
    void test10() {
        int price = 150000;
        int answer = 0;
        int result = 142500;
        double discount = 0.0;

        if ( price >= 500000) {
            discount = 0.2;
        } else if (price < 500000 && price >= 300000) {
            discount = 0.1;
        } else if (price < 300000 && price >= 10000) {
            discount = 0.05;
        }
        answer = (int) Math.ceil(price - (price * discount));

        assertEquals(answer, result);
    }

    @Test
    @DisplayName("배열 역순")
    void test11() {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = {};
        int[] result = {5, 4, 3, 2, 1};

        answer = IntStream.rangeClosed(1, num_list.length).map(i -> num_list[num_list.length-i]).toArray();
        assertArrayEquals(answer, result);
    }
}
