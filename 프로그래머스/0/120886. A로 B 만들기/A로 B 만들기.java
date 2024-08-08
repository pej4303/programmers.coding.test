import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        // 유효성 검사
        if ( before.length() < 0 || 1000 < before.length() ) {
            return answer;
        }
        if ( after.length() < 0 || 1000 < after.length() ) {
            return answer;
        }
        
        // 문자열을 문자 배열로 변환
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        
        // 문자 배열을 정렬
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        // 정렬된 배열이 동일한지 비교
        answer = Arrays.equals(beforeArray, afterArray) ? 1 : 0;
        
        return answer;
    }
}