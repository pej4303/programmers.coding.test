package com.study.programmers.coding.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    @DisplayName("key - value 이용")
    void test02() {
        String[] participant = { "leo", "kiki", "eden" };
        String[] completion = { "eden", "kiki" };

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for ( String strKey : map.keySet() ){
            if ( map.get(strKey) != 0 ) {
                answer = strKey;
            }
        }

        System.out.println(answer);
    }

    @Test
    @DisplayName("이진수 TO 십진수")
    void test17() {
        String binary1 = "01001"; // 첫 번째 이진수
        String binary2 = "11110"; // 두 번째 이진수

        int decimalNumber = Integer.parseInt(binary1, 2);
        System.out.println("십진수: " + decimalNumber);

        int decimalNumber2 = Integer.parseInt(binary2, 2);
        System.out.println("십진수: " + decimalNumber2);

        String sum = Integer.toBinaryString(decimalNumber + decimalNumber2);
        System.out.println("결과 = " + sum);

        String result = Integer.toBinaryString(39);
        System.out.println("결과 = " + result);
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

//    public static void main(String[] args) {
//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
//        int[] answer;
//
//        ArrayList<Integer> result = new ArrayList<>();
//        result.add(arr[0]);
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != arr[i - 1]) {
//                result.add(arr[i]);
//            }
//        }
//
//        answer = result.stream().mapToInt(Integer::intValue).toArray();
//
//        System.out.println(result.toString());
//        System.out.println(answer);
//    }
}

