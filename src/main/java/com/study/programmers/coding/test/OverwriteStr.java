package com.study.programmers.coding.test;

import org.springframework.stereotype.Component;

/**
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class OverwriteStr {
    public String solution(String my_string, String overwrite_string, int s) {
        /**
         * [제한사항]
         *  - my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
         *  - 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
         *  - 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
         */
        String answer = "";

        if (validate(my_string, overwrite_string, s)) {
            // replace()를 사용하면 테스트케이스를 통과하지 못하여 변경함
//            String tmp = my_string.substring(s, overwrite_string.length() + s );
//            answer = my_string.replace(tmp, overwrite_string);

            int myStrLen = my_string.length();
            int overStrLen = overwrite_string.length();

            String tmp = my_string.substring(0, s);
            String tmp2 = my_string.substring(( s + overStrLen), myStrLen);

            answer += tmp + overwrite_string + tmp2;
        }

        return answer;
    }

    public boolean validate(String my_string, String overwrite_string, int s) {
        boolean result = false;

        if ( 1<= overwrite_string.length() && overwrite_string.length() <= 1000) {
            result = true;
        }

        if ( 1<= my_string.length() && my_string.length() <= 1000) {
            result = true;
        }

        if ( 0 <= s && s <= (my_string.length() - overwrite_string.length()) ) {
            result = true;
        }

        return result;
    }
}
