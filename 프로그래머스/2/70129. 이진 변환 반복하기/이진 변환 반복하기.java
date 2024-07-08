import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0; // 이진변환 횟수
        int removeZero = 0; // 제거한 0의 개수
        
        // s가 "1"이 될 때까지 
        while (!s.equals("1")) {
            int cntZero = (int) s.chars().filter(ch -> ch == '0').count();
            cnt++;
            removeZero += cntZero;
            
            // 이진 변환
            int tmp = s.length() - cntZero;
            s = Integer.toString(tmp, 2);
        }
        
        answer[0] = cnt;
        answer[1] = removeZero;
        
        return answer;
    }
}