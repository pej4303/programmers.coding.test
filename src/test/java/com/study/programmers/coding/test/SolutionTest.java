package com.study.programmers.coding.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

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
//                    break;
//                }
//            }
//        }

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

}

