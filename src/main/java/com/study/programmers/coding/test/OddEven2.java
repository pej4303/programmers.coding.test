package com.study.programmers.coding.test;

import java.util.stream.IntStream;

/**
 * 양의 정수 n이 매개변수로 주어질 때,
 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 *
 * @date 2023-10-31
 */
public class OddEven2 {
    public int solution(int n) {
        int answer = 0;

        if ( n % 2 == 0) {
            // 짝수
            answer = IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).map(x -> x * x).sum();
        } else {
            // 홀수
            answer = IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).sum();
        }

        return answer;
    }
}
