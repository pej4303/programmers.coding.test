import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        /* 설계 흐름 */
        /*
        방법1)
        1. name 배열과 yearning 배열을 기반으로 이름별 그리움 점수를 조회할 수 있도록 Map 형태로 변환
        2. photo 배열을 순회 - for문 이용
        3. 이름이 map에 존재하는 경우 해당 점수를 더하고 존재하지 않으면 0을 더한다 - getOrDefault
        4. answer 반환
        */
        
        // 1. name 배열과 yearning 배열을 기반으로 이름별 그리움 점수를 조회할 수 있도록 Map 형태로 변환
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        // 2. photo 배열을 순회 - for문 이용
        for (int i=0; i<photo.length; i++) {
            for (int j=0; j<photo[i].length; j++) {
                // 3. 이름이 map에 존재하는 경우 해당 점수를 더하고 존재하지 않으면 0을 더한다 - getOrDefault
                answer[i] += map.getOrDefault(photo[i][j], 0);
            }
            // System.out.println("answer = " + answer[i]);
        }
        
        // 4. answer 반환
        return answer;
    }
}