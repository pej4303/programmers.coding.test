class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        // 밀지 않아도 동일한 경우
        if (A.equals(B)) {
            return answer;    
        }
        
        int len = A.length();
        String tmpStr = A;
        
        // 최대 len번까지 밀어본다
        for (int i = 0; i < len; i++) {
            tmpStr = tmpStr.charAt(len - 1) + tmpStr.substring(0, len - 1);
            answer++;
            if (tmpStr.equals(B)) {
                return answer;
            }
        }
        
        // len번 밀어도 B와 같아지지 않으면 -1 반환
        return -1;
    }
}
