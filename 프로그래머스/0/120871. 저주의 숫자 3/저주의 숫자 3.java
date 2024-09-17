class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            answer++;
            
            // 3의 배수와 숫자 "3"일때도 증가되게
            while ( answer % 3 == 0 || String.valueOf(answer).contains("3") ) {
                answer++;
            }
            //System.out.println(i + " = " + answer);
        }        
        
        return answer;
    }
  
}