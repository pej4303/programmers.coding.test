import java.util.*;
class Solution {
    class Process {
        int index;
        int priority;

        public Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        /* 설계 흐름 */
        /*
        방법1)
        0. 우선순위 큐 생성, index 변수 생성
        1. 우선순위 큐에 priorities 배열 담기
        2. 우선순위 큐를 순회하면서 index가 location과 같으면 break 다르면 answer 증가
        3. answer 반환 
        */
        
        /*
        방법2)
        1. 큐 생성
        2. 큐에 priorities 배열 담기
        3. 로직 처리
          - 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
          - 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 
            방금 꺼낸 프로세스를 다시 큐에 넣습니다.
          - 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
          - 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
        4. answer 반환 
        */
        // 1. 큐 생성 - Process를 담는 큐
        Queue<Process> queue = new LinkedList<>();
        // 2. 큐에 priorities 배열 담기
        for (int i=0; i<priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
        }

        // 3. 로직 처리
        while (!queue.isEmpty()) {
            // - 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
            Process process = queue.poll();
            
            boolean isFlag = false;
            for (Process p : queue) {
                if (p.priority > process.priority) {
                    isFlag = true;
                    break;
                }
            }
            
            if (isFlag) {
                // - 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
                queue.offer(process);
            } else {
                // - 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
                answer++;
                if (process.index == location) {
                    return answer;
                }
            }
            
            // - 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
        }
      
        
        // 해당 프로세스가 몇 번째로 실행되는지 return
        return answer;
    }
}