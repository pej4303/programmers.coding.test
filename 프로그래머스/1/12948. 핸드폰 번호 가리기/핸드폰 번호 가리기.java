class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        if (4 <= phone_number.length() && phone_number.length() <= 20) {
            String lastNum = phone_number.substring(phone_number.length()-4, phone_number.length());
            
            answer = "*".repeat(phone_number.length()-4) + lastNum;
        }
        return answer;
    }
}