class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] charArr = my_string.toCharArray();
        
        // 문자열 바꾸기
        char tmp = charArr[num1];
        charArr[num1] = charArr[num2];
        charArr[num2] = tmp;
        
        // 문자열로 변경
        answer = new String(charArr);
        
        return answer;
    }
}