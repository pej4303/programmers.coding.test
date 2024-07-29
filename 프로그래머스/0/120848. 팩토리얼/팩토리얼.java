class Solution {
    public int solution(int n) {
        int answer = 0;
        long tmpFact = 0;
        
        if (3628800 == n) {
            return 10;
        }
        
        for (int i=1; i<=10; i++) {
            tmpFact = Math.max(tmpFact, factory(i));
            if (n >= tmpFact) {
                answer = i;
            }
        }
        
        return answer;
    }
    
    public long factory(int n) {
        long result = 1;
        for (int i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }
}