import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");
        
        // 배열 오름차순
        Arrays.sort(A); 
        Arrays.sort(B); 

        int len = A.length;
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[len - 1 - i];
        }
        // 출력
        // : 배열 A, B가 주어질 때 최종적으로 누적된 최솟값
        return answer;
    }
}