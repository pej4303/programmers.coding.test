package com.study.programmers.coding.test;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 *
 * @date 2023-10-30
 */
public class ChangeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        // 제한사항 : 1<= str 길이 <= 20
        if ( str.length() >= 1 && str.length() <= 20 ) {
            for (Character c : str.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    result += Character.toUpperCase(c);
                } else if (Character.isUpperCase(c)) {
                    result += Character.toLowerCase(c);
                }
            }

            System.out.println(result);
        }
    }
}
