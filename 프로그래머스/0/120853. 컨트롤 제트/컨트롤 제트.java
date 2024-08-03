import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = 0;        
        
        Stack<String> stack = new Stack<>();
        String[] strArr = s.split(" ");
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(strArr[i]);
            }
        }

        for (String item : stack) {
            answer += Integer.parseInt(item); // 스택에 남아 있는 값의 합을 구함
        }

        return answer;
    }
}
