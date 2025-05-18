import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();

        // 1. 문자열 s를 왼쪽부터 한 글자씩 읽는다 (for문)
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            // System.out.println();
           // 2. 문자를 처음 보면, answer[i] = -1
           // 문자를 이미 봤다면, 현재 위치 i와 그 문자의 마지막 등장 위치와의 거리 기록
           if (map.containsKey(c)) {
               // 문자를 이미 봤다면
                answer[i] = i - map.get(c);
            } else {
               // 문자를 처음 보면
                answer[i] = -1;
            }
            
            // 3. 문자 위치 갱신
            map.put(c, i);
        }
        
        // 3. 출력
        
        return answer;
    }
}