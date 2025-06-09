import java.time.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        // 1. LocalDate 이용
        LocalDate localDate = LocalDate.of(2016, a, b);
        // 2. day를 숫자로 받기
        int tmp = localDate.getDayOfWeek().getValue();
        // 3. answer 출력
        answer = switch (tmp) {
            case 1 -> "MON";
            case 2 -> "TUE";
            case 3 -> "WED";
            case 4 -> "THU";
            case 5 -> "FRI";
            case 6 -> "SAT";
            case 7 -> "SUN";
            default -> "";
        };
        
        return answer;
    }
}