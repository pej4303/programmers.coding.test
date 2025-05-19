import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        /* 설계 흐름 */
        /*
         방법1)
         1. strings 순회 - for문 이용
         2. strings 정렬시 n번째 글자순으로 - Arrays.sort() 
         => 이렇게 하면 for문을 할 필요가 없음
         */
      
        /*
        방법2)
        1. n번재 글자순으로 정렬되게 - Arrays.sort() 이용
        2. Comparator를 재정의하여 n번재 글자를 비교 같으면 글자를 비교
        => 시간복잡도 O(n log n)
        */
        Arrays.sort(strings, (s1, s2) -> {
            // 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            } else {
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
        });
        
        // 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
        return strings;
    }
}