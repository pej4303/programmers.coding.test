class Solution {
    public String solution(String s) {
        String answer = "";
        /*
        문자열길이 = 짝수이면 문자열길이/2 부터 2글자만 잘라서 반환
        문자열길이 = 홀수이면 문자열길이/2 부터 1글자만 잘라서 반환
        */
        int startIdx = 0;
        if (s.length() % 2 == 0) {
            startIdx = (s.length() / 2) - 1;
            answer = s.substring(startIdx, startIdx+2);
        } else {
            startIdx = (s.length() / 2);
            System.out.println(startIdx);
            answer = s.substring(startIdx, startIdx+1);
        }
        
        return answer;
    }
}