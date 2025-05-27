import java.time.*;
import java.time.format.*;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        /* 설계 흐름 */
        /*
        방법1)
        0. 약관 정보(terms) 배열을 Map 형태로 변환
           - 각 약관명을 key로 유효기간을 일단위로 환산한 값을 value로 하여 형태로 변환한다.
             예) "A 6" => map.put("A", 6 * 28);
        1. 개인정보 수집 내역(privacies) 배열 순회 - for문 이용
        2. 파기 대상 여부 판단
           - 개인정보 수집일자를 LocalDate로 변환한다.
           - 해당 항목의 약관 유형을 기준으로 유효기간을 더해 파기 예정일을 계산한다.
           - 파기 예정일 = 개인정보 수집일 + 유효기간(일) - 1
           - 오늘 날짜와 파기 예정일을 비교한다. - isBefore() 이용
        3. answer return
        => 파기 예정일이 안 맞음. LocalDate가 아니라 직접 계산해야 한다. ㅠㅠ
        */

        /*
        방법2)
        0. 약관 정보(terms) 배열을 Map 형태로 변환
        1. 오늘 날짜를 모든 달이 28일인 가상의 달력을 기준으로 변환
        2. 개인정보 수집 내역(privacies) 배열 순회 - for문 이용
        3. 파기 대상 여부 판단
           - 개인정보 수집일자를 모든 달이 28일인 가상의 달력을 기준으로 변환한다.
           - 해당 항목의 약관 유형을 기준으로 유효기간을 더해 파기 예정일을 계산한다.
           - 파기 예정일 = 개인정보 수집일 + 유효기간(일) - 1
           - 오늘 날짜와 파기 예정일을 비교한다. 
        4. List -> 배열로 변환하여 return - mapToInt() 이용
        */
        
        String[] tmpArr = null;
        
        // 0. 약관 정보(terms) 배열을 Map 형태로 변환
        Map<String, Integer> termsMap = new HashMap<>();
        for (String str : terms) {
            tmpArr = str.split(" ");
            termsMap.put(tmpArr[0], Integer.parseInt(tmpArr[1]));
        }
        
        // 1. 오늘 날짜를 모든 달이 28일인 가상의 달력을 기준으로 변환
        int convertToDay = convertDate(today);
        
        // 2. 개인정보 수집 내역(privacies) 배열 순회 - for문 이용
        for (int i=0; i<privacies.length; i++) {
            // 3. 파기 대상 여부 판단
            tmpArr = privacies[i].split(" ");
           
            // 개인정보 수집일자를 모든 달이 28일인 가상의 달력을 기준으로 변환한다.
            int tmpDate = convertDate(tmpArr[0]);
            // 유효기간(월)
            int month = termsMap.get(tmpArr[1]);
            
            // 해당 항목의 약관 유형을 기준으로 유효기간을 더해 파기 예정일을 계산한다.
            // 파기 예정일 = 개인정보 수집일자 + (해당 약관 유효기간 * 28) - 1 
            int calcDate = tmpDate + (month * 28) - 1;
            
            // 오늘 날짜와 파기 예정일을 비교한다. 
            if (convertToDay > calcDate) {
                // 파기 대상
                result.add(i+1);
            }
        }
        
        // result.forEach(System.out::println);
        
        // 4. answer return - List -> 배열로 변환
        answer = result.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
    
    // 모든 달이 28일인 가상의 달력 형태로 변환
    private int convertDate(String date) {
       String[] tmp = date.split("\\.");
       int year = Integer.parseInt(tmp[0]) * 12 * 28;
       int month = Integer.parseInt(tmp[1]) * 28;
       int day = Integer.parseInt(tmp[2]);
       
       return year + month + day;
    }
}