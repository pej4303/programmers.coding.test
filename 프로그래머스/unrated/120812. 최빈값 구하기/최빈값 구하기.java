import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 1;
        int maxCount = 0;           
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // countMap을 순회하면서 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int currentCount = entry.getValue();
            if (currentCount > maxCount) {
                maxCount = currentCount;
                answer = entry.getKey();
            } else if (currentCount == maxCount) {
                // 최빈값이 여러 개인 경우 -1 반환
                answer = -1;
            }
        }
        
        return answer;
    }
}