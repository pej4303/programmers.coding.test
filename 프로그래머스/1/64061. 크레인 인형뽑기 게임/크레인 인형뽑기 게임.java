import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        /* 설계 흐름 */
        /*
        방법1)
        0. 바구니 생성 - 스택 이용
        1. moves 배열을 순회 - for문 이용
        2. 각 행의 순회하면서 해당 열에 맨 첫번째 값을 찾기
        3. 스택의 첫번째값이랑 찾은값이 같으면 pop() 아니면 push() 
          - 같은 경우: stack.pop() 두 번 (쌍 제거)
          - 다른 경우: stack.push() (값 추가)
        4. answer return
        */
        
        // 0. 바구니 생성 - 스택 이용
        Stack<Integer> stack = new Stack<>();
        // 1. moves 배열을 순회 - for문 이용
        for (int i=0; i<moves.length; i++) {
            int col = moves[i] - 1;
            // 2. 각 행의 순회하면서 해당 열에 맨 첫번째 값을 찾기
            for (int row=0; row<board.length; row++) {
                int now = board[row][col];
                if (now != 0) {
                    // 3. 스택의 첫번째값이랑 찾은값이 같으면 pop() 아니면 push() 
                    if (!stack.isEmpty() && stack.peek() == now) {
                        stack.pop();  // 기존 인형 제거 
                        answer += 2;  // 두 인형이 없어짐 (2개 터짐)
                    } else {
                        stack.push(now);
                    }
                    // 인형 뽑았다는 표시
                    board[row][col] = 0;
                    break;
                } 
            }
        }
        
        return answer;
    }
}