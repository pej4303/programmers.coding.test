import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        if (numbers.length >= 1 && numbers.length <= 1_00_000) {
           if ( Arrays.stream(numbers).allMatch(i -> i == 0) ) {
                answer = "0";
            } else {
                // 숫자를 문자열로 변환
                String[] tmp = new String[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    tmp[i] = String.valueOf(numbers[i]);
                }

                // Comparator를 재정의하여 내림차순 정렬
                Arrays.sort(tmp, new Comparator<String>() {
                    public int compare(String a, String b) {
                        String num1 = a + b;
                        String num2 = b + a;
                        return num2.compareTo(num1);
                    }
                });
                // System.out.println(Arrays.toString(tmp));

                for (String s : tmp) {
                    answer += String.join("", s);
                }
                // System.out.println(result);
            }
        }
        
        return answer;
    }
}