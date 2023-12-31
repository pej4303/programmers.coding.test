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

    @Test
    @DisplayName("문자열 역순")
    void test12() {
        String my_string = "jaron";
        String answer = "";
        String result = "noraj";

        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.reverse().toString();

        assertEquals(answer, result);
    }
    @Test
    void test13() {
        int n = 10;
        int result = 30;
        int answer = 0;
        answer = IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();

        assertEquals(answer, result);
    }

    @Test
    void test14() {
        String s = " for the last week ";

        String result = " For The Last Week ";

        StringBuffer sb = new StringBuffer();

        String[] arr = s.split(" ");

        for (int i=0; i<arr.length; i++) {
            if (  !arr[i].isBlank() && Character.isLetter(arr[i].charAt(0)) ) {
                sb.append(Character.toUpperCase(arr[i].charAt(0)));
                for (int j=1; j<arr[i].toCharArray().length; j++) {
                    sb.append(Character.toLowerCase(arr[i].charAt(j)));
                }

            } else {
                // 대문자로 변환하지 않음
                sb.append(arr[i]);
                sb.append(" ");
            }

        }
        System.out.println(sb.toString());
        assertEquals(sb.toString(), result);
    }

    @Test
    void test15() {
        String s = "pPoooyY";
        boolean answer = true;

//        boolean result = true;
//
//        int cntP = 0;
//        int cntY = 0;
//
//        long test = s.chars().filter(e -> 'P' == e).count();
//        System.out.println(test);
//
//        for (String str : s.toLowerCase().split("")) {
//            if (str.equals("p")) {
//                cntP++;
//            }
//
//            if (str.equals("y")) {
//                cntY++;
//            }
//        }
//
//        if ( (cntP == cntY) || (cntP == 0 && cntY == 0) ) {
//            answer = true;
//        } else {
//            answer = false;
//        }

        // 이렇게 간단하다니...
        boolean result = s.toLowerCase().chars().filter(i -> 'p' == i).count() == s.toLowerCase().chars().filter(i -> 'y' == i).count();

        assertEquals(answer, result);
    }


    @Test
    void test16() {
        int answer = 2;
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        int result = 1;
//        String regex = "(?=.*z)(?=.*d)(?=.*x).*";

//        String[] spell = {"p", "o", "s"};
//        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
//        int result = 2;

//        String regex = ".*[" + String.join("", spell) + "].*";
//        System.out.println("regex = " + regex);

//        String regex = "(?=.*p)(?=.*o)(?=.*s).*";

        StringBuffer sb = new StringBuffer();
        for (String s : spell) {
            sb.append("(?=.*");
            sb.append(s);
            sb.append(")");
        }
        sb.append(".*");

        String regex = sb.toString();

        if (1 <= dic.length && dic.length <= 10 ) {
            for (String str : dic) {
                if ( str.matches(regex) ) {
                    System.out.println(str);
                    answer = 1;
                    break;
                }
            }
        }

        assertEquals(answer, result);
    }


    /**
     * 직각삼각형 출력하기(별 찍기)
     *
     * @date  2023-12-25
     * @param args
     */
//    public static void main(String[] args) {
//        int min = Arrays.stream("1 2 3 4".split(" ")).mapToInt(Integer::parseInt).summaryStatistics().getMin();
//        int max = Arrays.stream("1 2 3 4".split(" ")).mapToInt(Integer::parseInt).summaryStatistics().getMax();
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
//
//    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(result.toString());
//        answer = (int[]) result.toArray();
        System.out.println(answer);
//        return answer;
    }
}

