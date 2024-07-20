import java.util.Stack;

class Solution {
    static int answer = 0;

    public static class State {
        public final int index;
        public final int acc;

        State(int index, int acc) {
            this.index = index;
            this.acc = acc;
        }
    }

    public static int solution(int[] numbers, int target) {
        // answer 초기화
        answer = 0;
        
        // DFS 함수 호출
        dfs(0, numbers, target);
        
        return answer;
    }

    public static void dfs(int index, int[] numbers, int target) {
        Stack<State> stack = new Stack<>();
        stack.push(new State(0, 0)); // 초기 상태 푸시

        while (!stack.isEmpty()) {
            State sts = stack.pop(); // 상태 꺼내기

            // 종료 조건: 모든 숫자를 처리한 경우
            if (sts.index == numbers.length) {
                // 현재 합이 target과 같은지 확인
                if (sts.acc == target) {
                    answer++;
                }
                continue;
            }

            // 다음 상태 푸시: 현재 숫자를 더하는 경우와 빼는 경우
            stack.push(new State(sts.index + 1, sts.acc - numbers[sts.index]));
            stack.push(new State(sts.index + 1, sts.acc + numbers[sts.index]));
        }
    }
}
