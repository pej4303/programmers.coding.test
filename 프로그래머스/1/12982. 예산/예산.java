import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        /*
        부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 
        최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
        */
        int answer = 0;
        // System.out.println("");
        
        // 배열 정렬
        Arrays.sort(d);
        
        int left = 0;
        int right = d.length;
        
        // 이분 탐색
        while (left <= right) {
            // 중간값 찾기
            int mid = (left + right) / 2;
            
            int sum = 0;
            for (int i= 0; i<mid; i++) {
                sum += d[i];
            }
            
            if (sum <= budget) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        
        return answer;
    }
}