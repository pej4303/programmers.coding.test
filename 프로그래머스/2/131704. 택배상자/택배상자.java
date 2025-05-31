import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        // 1번 상자부터 n번 상자까지 번호가 증가하는 순서대로 컨테이너 벨트에 일렬로 놓여 영재에게 전달됩니다. 
        // 보조 컨테이너 벨트 : 스택구조
        
        /* 설계 흐름 */
        /*
        방법1)
        1. 현재 박스 번호를 나타내는 nowBoxNum 변수, 보조 컨테이너 벨트 생성 - stack 이용
        2. while문 이용
        3. 로직 처리
           case1) 메인 컨테이너 벨트에서 박스를 꺼낼 수 있고 그 박스가 order[i]보다 작거나 같을 때 
                  => order와 현재 박스 번호가 같으면 트럭에 바로 싣고 다음 order로 이동
                  => 그렇지 않으면 보조 컨테이너 벨트에 보관하고 다음 박스로 이동
           case2) 메인 벨트에서 꺼낼 수 없거나 order[i]가 현재보다 작은 경우  
                  => 보조 컨테이너 벨트의 맨 위 박스가 실어야 할 박스면 트럭에 싣기
                  => 아니면 더 이상 실을 수 없으므로 종료 - break
        4. 위의 과정을 반복하며 order 배열의 끝까지 처리
        */

        
        // 1. 현재 박스 번호를 나타내는 nowBoxNum 변수, 보조 컨테이너 벨트 생성 - stack 이용
        // 보조 컨테이너 벨트
        Stack<Integer> stack = new Stack<>();
        
        int nowBoxNum = 1; // 현재 박스 번호
        int i = 0;     // order 배열 인덱스

        // 2. while문 이용
        while (true) {
            // case1) 메인 컨테이너 벨트에서 박스를 꺼낼 수 있고 그 박스가 order[i]보다 작거나 같을 때 
            if (nowBoxNum <= order.length && order[i] >= nowBoxNum) {
                if (order[i] == nowBoxNum) {
                    // order와 현재 박스 번호가 같으면 트럭에 바로 싣고 다음 order로 이동
                    answer++;
                    i++;
                    nowBoxNum++;
                } else {
                    // 그렇지 않으면 보조 컨테이너 벨트에 보관하고 다음 박스로 이동
                    stack.push(nowBoxNum++);
                }
            }
            // case2) 메인 벨트에서 꺼낼 수 없거나 order[i]가 현재보다 작은 경우  
            else {
                if (!stack.isEmpty() && stack.peek() == order[i]) {
                    // 보조 컨테이너 벨트의 맨 위 박스가 실어야 할 박스면 트럭에 싣기
                    stack.pop();
                    answer++;
                    i++;
                } else {
                    // 위의 어떤 조건에도 해당하지 않으면 더 이상 실을 수 없음 
                    break;
                }
            }
        }

        return answer;
    }
}