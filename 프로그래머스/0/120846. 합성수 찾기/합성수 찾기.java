class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
           if (numCnt(i) >= 3) {
               answer++;
           }
        }
        
        return answer;
    }
    // 합성수 판단
    public int numCnt(int num) {
        int result = 0;
        
        for (int i=1; i<=num; i++) {
          if (num % i == 0) {
              result++;
          }  
        }
        
        return result;
    }
}