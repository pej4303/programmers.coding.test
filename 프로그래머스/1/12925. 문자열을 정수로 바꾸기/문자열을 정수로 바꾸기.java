class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if ( 1 <= s.length() && s.length() <= 5 ) {
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}