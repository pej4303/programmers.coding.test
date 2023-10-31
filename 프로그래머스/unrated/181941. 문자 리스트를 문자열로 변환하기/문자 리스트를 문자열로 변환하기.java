import java.util.Arrays;

class Solution {
    public String solution(String[] arr) {
        /**
         * 제한사항
         * - 1 ≤ arr의 길이 ≤ 200
         * - arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
         */
        String answer = "";

        if (1<= arr.length && arr.length <= 200) {
            answer = String.join("", arr);
            System.out.println(answer);
        }

        return answer;
    }
}