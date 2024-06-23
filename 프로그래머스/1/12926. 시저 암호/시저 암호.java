class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        
        // 유효성 검사 : n은 1 이상, 25이하인 자연수입니다.
        if (n >= 1 && n <= 25) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // System.out.println((char)(c + n));
                
                // c - 'a'  : 현재 문자 몇번째 위치인지 구함
                // (c - 'a' + n) : 문자 c를 n만큼 이동시킨 새로운 위치를 계산
                // (c - 'a' + n) % 26 :  알파벳이 순환되도록 하기 위해서
                // (c - 'a' + n) % 26 + 'a') : 다시 'a'를 더해주면 원래 문자 범위로 돌아감
                System.out.println((char) ((c - 'a' + n) % 26 + 'a'));
                if (c >= 'a' && c <= 'z') {
                    sb.append((char) ((c - 'a' + n) % 26 + 'a'));
                } else if (c >= 'A' && c <= 'Z') {
                    sb.append((char) ((c - 'A' + n) % 26 + 'A'));
                } else {
                    sb.append(c);
                }
                // sb.append( (char)(c + n) );
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}