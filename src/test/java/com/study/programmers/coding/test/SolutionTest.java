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
    @DisplayName("해시 - 포켓몬")
    void test03() {
        int[] nums = {3, 3, 3, 2, 2, 2};
        int answer = 0;

        int maxCnt = nums.length / 2;
        int[] tmp = Arrays.stream(nums).distinct().toArray();

        if (maxCnt == tmp.length) {
            answer = maxCnt;
        } else {
            answer = tmp.length;
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
        int num = 626331;   // int형인 경우 오버플러우 발생한다고함, 어떻게 발생하는지 확인해볼것!
        if (1 < num && num <=8_000_000) {
            // 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환
            while (true) {
                num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
                answer++;

                System.out.println(num);

                if (num != 1 && answer == 500) {
                    answer = -1;
                    break;
                }

                if (num == 1) {
                    break;
                }
            }
        }

        // System.out.println("answer = " + answer);
    }
}

