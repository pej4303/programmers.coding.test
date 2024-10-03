class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] wordArr = { "aya" , "ye", "woo", "ma" };
        
        for (String word : babbling) {
            for (String tmp : wordArr) {
                // 발음 가능한 단어를 빈 문자열로 변경.
                word = word.replace(tmp, " ");
            }
            // 남은 부분이 모두 공백이면 유효한 단어로 처리.
            if (word.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}