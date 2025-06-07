import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        /* 설계 흐름 */
        /*
        방법1)
        0. process 라는 클래스를 생성, List<Integer> 타입도 하나 생성
        1. Stack<Process> 타입으로 생성하여 작업 진도와 개발 속도를 함께 체크
        2. progresses 배열을 스택으로 변환 
        3. 스택을 순회하면서 해당값이 100이 되면 pop()
           - 그 다음값도 100이 되는지 체크
        4. answer 반환
        */
        
        /*
        방법2)
        1. 각 기능이 완료되기까지 걸리는 날짜 계산 - for문
        2. 로직 처리
         - 첫 번째 작업의 완료일을 기준 - pivot
         - 순회하며 pivot보다 작거나 같으면 같은 날 배포
         - 더 크면 새로운 배포 시작
        3. answer 반환
        */
        int[] days = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        
        // 1. 각 기능이 완료되기까지 걸리는 날짜 계산 - for문
        for (int i=0; i<days.length; i++) {
            days[i] = (int) Math.ceil( (100.0 - progresses[i]) / speeds[i]);

        }
        // System.out.println( Arrays.toString(days) );
        
        // 2. 로직 처리
        int pivot = days[0];
        int cnt = 1;

        for (int i=1; i<days.length; i++) {
            if (days[i] <= pivot) {
                // 순회하며 pivot보다 작거나 같으면 같은 날 배포
                cnt++;
            } else {
                // 더 크면 새로운 배포 시작
                list.add(cnt);
                
                pivot = days[i];
                cnt = 1;
            }
        }
        
        list.add(cnt);
        
        // List -> 배열로 변환
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
}