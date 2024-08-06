import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 빈도 계산
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // 한번만 나온 문자만 다시 담기
        Set<Character> set = new TreeSet<>();
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                set.add(c);
            }
        }
        
        // 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char c : set ) {
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}