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


    public static void main(String[] args) {
        int answer = 0;
        int num = 6;

        if (1 < num && num <=8_000_000) {
            // 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환
            answer = callCollatz(num, 0);
            System.out.println(answer);
        }
    }

    static int callCollatz(int num, int callCnt) {
        int tmp = 0;

        // 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        if (num == 1) {
            return callCnt;
        } else if (num != 1 && callCnt == 500) {
            return -1;
        }

        if (num % 2 == 0) {
            // 1-1. 입력된 수가 짝수라면 2로 나눕니다.
            tmp = num / 2;
        } else {
            // 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
            tmp = num * 3 + 1;
        }

        callCnt++;

        return callCollatz(tmp, callCnt);
    }
}

