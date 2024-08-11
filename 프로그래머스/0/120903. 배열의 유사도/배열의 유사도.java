import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        // 유효성 검사
        if ( 1 > s1.length || s1.length > 100 ) {
            return answer;
        }
        if ( 1 > s2.length || s2.length > 100 ) {
            return answer;
        }
        
        // 방법1) 이중 for문
        /*
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        if ( s1.length > s2.length ) {
            for (int i=0; i< s1.length; i++) {
               for (int j=0; j<s2.length; j++) {
                   if (s1[i].equals(s2[j])) {
                       answer++;
                   }
               }
            }
        } else {
            for (int i=0; i< s2.length; i++) {
               for (int j=0; j<s1.length; j++) {
                   if (s2[i].equals(s1[j])) {
                       answer++;
                   }
               }
            }
        }
        */
        // 방법2) Set 이용
        Set<String> set1 = new HashSet<>(Arrays.asList(s1));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2));

        // 교집합을 구하기
        set1.retainAll(set2);

        // 교집합의 크기 반환
        answer = set1.size();
        
        return answer;
    }
}