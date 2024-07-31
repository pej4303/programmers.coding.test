import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer = my_string.chars()         // IntStream으로 변환
                 .distinct()      // 중복 제거
                 .mapToObj(c -> String.valueOf((char) c)) // 문자로 변환
                 .collect(Collectors.joining()); // 문자열로 합침
        
        return answer;
    }
}