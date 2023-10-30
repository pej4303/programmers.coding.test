package com.study.programmers.coding.test;

import java.util.Scanner;

/**
 * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
 * 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
 *
 * @date 2023-10-30
 */
public class ConcatStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // 제한사항 : 1 ≤ str1, str2의 길이 ≤ 10
        if ( (1<= str1.length() && str1.length() <= 10) && (1<= str2.length() && str2.length() <= 10) ) {
            System.out.println(str1.concat(str2));
        }
    }
}
