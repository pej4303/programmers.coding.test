import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        /* 설계 흐름 */
        
        /*
        방법1)
        1. k길이 만큼 배열 생성
        2. score 순회 - for문 이용
        3. score값을 받아서 만든 배열 정렬
        4. answer 배열에 k번째 값 저장
        
        => 정렬을 매번 수행하면 시간복잡도가 올라간다.
        */
        
        /*
        방법2)
        1. 우선순위 큐 생성
        2. score 순회 - for문 이용
        3. 현재 점수를 우선순위 큐에 추가
        4. 큐의 길이가 k를 초과하면 가장 낮은 점수 제거 - poll()
        5. 현재 우선순위 큐에서 가장 낮은 점수를 answer에 저장 - peek()
        */
        // 1. 우선순위 큐 생성
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        // 2. score 순회 - for문 이용
        for (int i=0; i<score.length; i++) {
            // 3. 현재 점수를 우선순위 큐에 추가
            queue.add(score[i]);
            
            // 4. 큐의 길이가 k를 초과하면 가장 낮은 점수 제거 - poll()
            if (queue.size() > k) {
                 queue.poll();
            }
            
            // 5. 현재 우선순위 큐에서 가장 낮은 점수를 answer에 저장 - peek()
            answer[i] = queue.peek();
        }
        
        // 매일 발표된 명예의 전당의 최하위 점수 
        return answer;
    }
}