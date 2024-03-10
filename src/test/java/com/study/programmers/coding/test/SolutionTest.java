package com.study.programmers.coding.test;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

public class SolutionTest {

    @Test
    void test1() {
        int[] numbers = {3, 4};
        int[] our_score = {85, 93};
        int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            System.out.println(numbers[i]);

            if (our_score[numbers[i]] == score_list[numbers[i]]) {
                answer[numbers[i]] = "Same";
            } else {
                answer[numbers[i]] = "Different";
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}

