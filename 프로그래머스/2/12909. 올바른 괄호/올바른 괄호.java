import java.util.*;

class Solution {
    boolean solution(String s) {
        if (s.length() > 100000) {
            return false;
        }
        
        /*Stack<String> stack = new Stack<>();
        for (String str : s.split("")) {
            if ("(".equals(str)) {
                stack.push(str); // 요소 넣기
            } else if (")".equals(str)) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop(); // 맨 위에 있는 요소를 제거
            }
        }*/
        
        // String에서 Character로 변경하니 효율성 테스트 성공하였음
        Stack<Character> stack = new Stack<>();  
        for (char c : s.toCharArray()) {  
            if (c == '(') {  
                stack.push('(');  
            } else if (c == ')') {  
                if (stack.isEmpty()) {  
                    return false;  
                }  
                stack.pop();  
            }  
        }  
        // () 한쌍으로 올바른 괄호라면 개수가 0이 나옴
        // System.out.println("개수 : " + stack.size());
        
        // answer = stack.isEmpty();

        return stack.isEmpty();
    }
}