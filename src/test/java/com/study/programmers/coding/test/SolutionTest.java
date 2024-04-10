package com.study.programmers.coding.test;


import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class SolutionTest {

    @Test
    void test1() {
        int n = 10;
        int result = 3;
        int answer = 0;

        if (3 <= n && n <= 1_000_000) {
            answer = IntStream.rangeClosed(3, 1_000_000).filter(i -> n % i == 1).min().getAsInt();
        }

        System.out.println(answer);
    }

    @Test
    void test2() {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        System.out.println(ingredient.toString());
    }

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        Stack stack = new Stack();

        for (int num : ingredient) {
            stack.push(num);
        }
    }


}
