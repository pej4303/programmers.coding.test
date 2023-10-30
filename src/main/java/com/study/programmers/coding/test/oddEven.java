package com.study.programmers.coding.test;

import java.util.Scanner;

/**
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 */
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 제한사항 : 1 ≤ n ≤ 1,000
        if ( 1<= n && n <= 1000) {
            if ( n % 2 == 0) {
                System.out.println(String.format("%d is even", n));
            } else {
                System.out.println(String.format("%d is odd", n));
            }
            // 방법2) 삼항연산자 이용
            // System.out.println(String.format("%d is %s", n, (n % 2 == 0) ? "even" : "odd"));
        }
    }
}
