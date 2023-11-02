package com.study.programmers.coding.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test1() {
		int[] num_list = new int[]{3,4,5,2,1};
		int result = 393;

		String str = IntStream.of(num_list).filter(i -> i % 2 != 0).map(o -> o).toString();

		assertEquals(result, str);
	}
}
