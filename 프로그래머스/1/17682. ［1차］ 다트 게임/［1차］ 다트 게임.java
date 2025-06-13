import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        /* 설계 흐름 */
        /*
        방법1)
        0. 점수 List 선언
        1. 횟수마다 자르기 - 정규표현식 이용
        2. 각 횟수 점수 계산
        3. answer 반환
        */
        
        // 0. 점수 List 선언
        List<Integer> list = new ArrayList<>();
        
        // 1. 정규표현식 이용해서 자르기
        Pattern pattern = Pattern.compile(
                            "(\\d{1,2})" +     // 1~2자리 숫자: 점수 (예: 1, 10)
                            "([SDT])" +        // 보너스: S(1제곱), D(2제곱), T(3제곱)
                            "([*#]?)"          // 옵션(있을 수도, 없을 수도 있음): * 또는 # 또는 없음
                        );
        
        Matcher matcher = pattern.matcher(dartResult);

        while (matcher.find()) {
            // System.out.println(matcher.group());
            String score = matcher.group(1);  // 점수
            String bonus = matcher.group(2);  // 보너스
            String option = matcher.group(3); // 옵션
            
            int current = calc(score, bonus);
            
            // 옵션 계산
            if ("*".equals(option)) {
                if (!list.isEmpty()) {
                    // 첫번째 값이 아니라면 이전점수를 2배로 만듬
                    list.set( list.size() - 1, list.get( list.size() - 1) * 2);
                }   
                // 현재 점수를 2배로 만듬
                current *= 2;
            } else if ("#".equals(option)) {
                current *= -1;
            }
            
            // System.out.println(current);
            

            list.add(current);
        }
        
        // 3. answer 반환
        answer = list.stream().mapToInt(Integer::intValue).sum();
        
        return answer;
    }
    
    private int calc(String score, String bonus) {
        int pow = 0;
        switch (bonus) {
            case "S":
                pow = 1;
                break;
            case "D":
                pow = 2;
                break;
            case "T":
                pow = 3;
                break;
        }
   
        return (int) Math.pow(Integer.parseInt(score), pow);
    }
}
