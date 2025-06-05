import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        /* 설계 흐름 */
        /*
        방법1)
        배열의 원소 순서가  빵(1) – 야채(2) – 고기(3) - 빵(1) 순인지 체크
        
        1. ingredient 배열을 문자열(str)로 변환
        2. 1231로 치환이 될때마다 answer 증가
          - while문 
        3. answer 반환
        => 테스트케이스는 통과 하였으나 제출까지는 통과하지 못함
        */
        /*StringBuilder sb = new StringBuilder();
        for (int n : ingredient) {
            sb.append(String.valueOf(n));
        }
        
        // System.out.println( sb );
        
        String str = sb.toString();
        while (true) {
            if (str.indexOf("1231") == -1) {
                break;
            }
            str = str.replace("1231", "");
            answer++;
        }*/
        
        /*
        방법2)
        1. 스택 생성
        2. ingredient 배열을 순회
          - 각 원소를 넣으면서 스택의 마지막 4개의 값이 1231인지 체크하여 맞으면 pop()을 4번 수행, answer 증가
        3. answer 반환
        */
        Stack<Integer> stack = new Stack<>();
        for (int num : ingredient) {
            stack.push(num);
            
            int size = stack.size();
            if (stack.size() >= 4) {
               if ( stack.get(size-4) == 1 &&
                    stack.get(size-3) == 2 &&
                    stack.get(size-2) == 3 &&
                    stack.get(size-1) == 1 ) {
                   
                   
                       for (int i=0; i<4; i++) {
                           stack.pop();
                       }
                   
                       answer++;
               }
            }
        }
        
        
        return answer;
    }
}