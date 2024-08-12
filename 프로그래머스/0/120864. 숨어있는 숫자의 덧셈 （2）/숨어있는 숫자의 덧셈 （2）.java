class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 유효성 검사
        if (1 > my_string.length() || my_string.length() > 1000) {
            return answer;
        }
        
        String tmpStr = "";
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                tmpStr += c;
            } else {
                if (!tmpStr.isEmpty()) {
                    answer += Integer.parseInt(tmpStr);
                    tmpStr = "";
                }
            }
        }
        
        // 남아 있는 숫자를 처리
        if (!tmpStr.isEmpty()) {
            answer += Integer.parseInt(tmpStr);
        }
        
        return answer;
    }
}
