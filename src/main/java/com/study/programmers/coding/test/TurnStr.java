package com.study.programmers.coding.test;

import java.util.Scanner;

/**
 * 문자열 str이 주어집니다.
 * 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
 *
 * @date 2023-10-30
 */
public class TurnStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 제한사항 : 1 ≤ str의 길이 ≤ 10
        if ( 1<= str.length() && str.length() <= 10 ) {
            // abcde
            for ( Character c : str.toCharArray() ) {
                System.out.println(c.toString());
            }
        }
    }
}
