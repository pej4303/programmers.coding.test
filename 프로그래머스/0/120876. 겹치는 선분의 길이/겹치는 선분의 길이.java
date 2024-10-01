import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>(); 
        
        for (int i=0; i<lines.length; i++) {
            int startDot = Math.min(lines[i][0], lines[i][1]);
            int endDot = Math.max(lines[i][0], lines[i][1]);
            
            for (int k = startDot; k<endDot; k++) {
               map.put(k, map.getOrDefault(k, 0) + 1);
            }
        }
        
        // map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        long cnt = map.values().stream()
            .filter(count -> count > 1)   // 값이 2 이상인 경우만 필터링
            .count();                     // 필터링된 값의 개수를 계산
        
        answer = (int) cnt;
        
        return answer;
    }
}