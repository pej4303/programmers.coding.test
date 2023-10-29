package com.study.programmers.coding.test;

import java.util.Scanner;

/**
 * 문자열 str과 정수 n이 주어집니다.
 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 *
 * @date 2023-10-30
 */
public class RepeatStr {
    /**
     * 방법1) repeat() 이용 => java 11버전부터 사용가능함
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        if (validate(str, n)) {
            // "," 입력하지 않았다면 추가해줌
            if (str.indexOf(",") == -1) {
                str += ",";
            }
            
            System.out.println(str.repeat(n));
        }
    }

    /**
     * 방법2)
     * @param args
     */
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        if (validate(str, n)) {
            for (int i=0; i <n; i++) {
                sb.append(str);
            }
            System.out.println(sb.toString());
        }

    }

    public static boolean validate(String str, int n) {
        boolean result = false;
        if ( str.length() >= 1 && str.length() <= 10 ) {
            result = true;
        }

        if ( n >= 1 && n <= 10 ) {
            result = true;
        }

        return result;
    }
}
