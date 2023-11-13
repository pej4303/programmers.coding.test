class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if ( 1<= n && n <= 100) {
            int pizzaCnt =  (n * 6) / gcd(n, 6);   // 피자 조각수
            // answer = pizzaCnt;
            
            if ( pizzaCnt <= 6) {
                answer = 1;
            } else {
               answer = pizzaCnt / 6 ;    
            }
        }
        
        return answer;
    }
    // 최대공약수를 계산하는 메서드
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}