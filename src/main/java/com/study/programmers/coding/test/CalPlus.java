package com.study.programmers.coding.test;

import java.util.Scanner;

/**
 * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
 *
 * @date 2023-10-30
 */
public class CalPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 제한사항 : 1 ≤ a, b ≤ 100
        if ( 1<= a && b <= 100) {
            System.out.println(String.format("%d + %d = %d", a, b, (a + b)));
        }
    }
}
