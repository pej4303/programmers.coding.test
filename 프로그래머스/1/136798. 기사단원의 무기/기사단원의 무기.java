class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        /* 설계 흐름 */
        
        /*
        방법1)
        1. 1부터 number까지 약수의 개수 구하기
        2. number까지의 약수들 중 limit를 초과하는 값들은 power로 값 변경하여 합계 구하기
        3. answer return
        */
        
        // 1. 약수 구하기 (1부터 number까지)
        for (int i=1; i<=number; i++) {    
            int cnt = calcCnt(i);
            
            // 2. number까지의 약수들 중 limit를 초과하는 값들은 power로 값 변경하여 합계 구하기
            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }
        
        // 3. answer return
        return answer;
    }
    
    private int calcCnt(int n) {
        int cnt = 0;
        
        for (int i=1; i*i<=n; i++) {
            if (n % i == 0) {
                cnt++;
                
                // 중복 계산을 방지하기 위해서
                if (i != n / i) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}