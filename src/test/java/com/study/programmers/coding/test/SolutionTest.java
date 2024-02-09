package com.study.programmers.coding.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.beans.FixedKeySet;
import org.springframework.util.Assert;

import java.util.*;
import java.util.stream.Stream;

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
    @DisplayName("key-value2")
    void test01() {
        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = { "123", "12345", "1245", "1243", "12"};

        boolean answer = true;

        // 효율성 테스트에서 통과하지 못했음
//        for (String phone : phone_book) {
//            for (int i=0; i<phone_book.length; i++) {
//                if ( !phone.equals(phone_book[i]) && phone.startsWith(phone_book[i]) ) {
//                    answer = false;
//                    break;
//                }
//            }
//        }

        Arrays.sort(phone_book);

        for (String phone : phone_book) {
            System.out.println(phone);
            for (int i=0; i<phone_book.length; i++) {
                System.out.println("## " + phone_book[i]);
                if ( !phone.equals(phone_book[i]) && phone.startsWith(phone_book[i]) ) {
                    answer = false;
                    break;
                }
            }
        }

        System.out.println(answer);
    }

    @Test
    @DisplayName("key-value3")
    void test03() {
//        String[] phone_book = {"119", "97674223", "1195524421" };
        String[] phone_book = {"123", "456", "789"};
        boolean answer = true;

        Arrays.sort(phone_book);
        System.out.println(Arrays.toString(phone_book));

        for (int i=0; i<phone_book.length-1; i++) {
            System.out.println(phone_book[i] + " / " + phone_book[i+1]);
            if ( phone_book[i].startsWith(phone_book[i+1]) ) {
                answer = false;
                break;
            }
        }


//        for (String phone : phone_book) {
//            for (int i=0; i<phone_book.length; i++) {
//                if ( !phone.equals(phone_book[i]) && phone.startsWith(phone_book[i]) ) {
//                    answer = false;
//                    break;"
//                }
//            }
//        }

        System.out.println(answer);
    }


    @Test
    void test04() {
        int[] citations = {3, 0, 6, 1, 5};

        Stream<Object> tmp = Arrays.stream(citations).mapToObj(String::valueOf);
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

    @Test
    void test05() {
//         int[] numbers = {6, 10, 2};
//         String answer = "6210";

//        int[] numbers = {34,30,9,5,3};
//        String answer = "9534330";

        int[] numbers = {0,0};
        String answer = "0";

        String result = "";

        if (numbers.length >= 1 && numbers.length <= 1_00_000) {
            if ( Arrays.stream(numbers).allMatch(i -> i == 0) ) {
                System.out.println("ddd");
                result = "0";
            } else {
                // 숫자를 문자열로 변환
                String[] tmp = new String[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    tmp[i] = String.valueOf(numbers[i]);
                }

                // Comparator를 재정의하여 내림차순 정렬
                Arrays.sort(tmp, new Comparator<String>() {
                    public int compare(String a, String b) {
                        String num1 = a + b;
                        String num2 = b + a;
                        return num2.compareTo(num1);
                    }
                });

                System.out.println(Arrays.toString(tmp));


                for (String s : tmp) {
                    result += String.join("", s);
                }
                System.out.println(result);
            }

            Assertions.assertEquals(answer, result);
        }
    }
}

