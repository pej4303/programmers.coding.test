package com.study.programmers.coding.test;

/**
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 *
 * @date 2023-10-31
 */
public class ShuffleStr {
    public String solution(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        /**
         * 제한사항
         *  - 1 ≤ str1의 길이 = str2의 길이 ≤ 10
         *  - str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
         */
        if ( (1 <= str1.length() && str1.length() <= 10) &&  (1 <= str2.length() && str2.length() <= 10) ) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            for (int i=0; i <arr1.length; i++) {
                sb.append(arr1[i]);
                sb.append(arr2[i]);
            }
        }

        return sb.toString();
    }
}