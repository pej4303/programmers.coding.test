import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 유효성 검사
        if (my_string.length() == 0 || my_string.length() > 100) {
            return answer;
        }
        
        // 문자열을 소문자로 변환
        char[] arr = my_string.toLowerCase().toCharArray();
        // 배열 정렬
        Arrays.sort(arr);
        
        // 정렬된 문자 배열을 문자열로 변환
        answer = new String(arr);
        
        return answer;
    }
}
