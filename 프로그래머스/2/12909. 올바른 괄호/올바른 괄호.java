import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        /* 설계 흐름 */
        
        /*
        방법1)
        1. 스택 생성
        2. 문자열 s를 순회 - for문 이용
        3. 로직 처리 
          -  () 가 되면 pop()
        4. 스택이 empty 이면 true, 아니면 false를 반환
        */
        
        // 1. 스택 생성
        Stack<Character> stack = new Stack<>();
        // 2. 문자열 s를 순회 - for문 이용
        char[] arr = s.toCharArray();
        for (int i=0; i<arr.length; i++) {
            // System.out.println(c);
            
            // 3. 로직 처리
            if (!stack.isEmpty() && stack.peek() == '(' && arr[i] == ')') {
                // () 가 되면 pop()
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
            
        }
        
        // System.out.println("isEmpty = " + stack.isEmpty());
        
        // 4. 스택이 empty 이면 true, 아니면 false를 반환
        answer = stack.isEmpty();
        
        return answer;
    }
}