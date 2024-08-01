import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        // 소수 : 2를 제외하고는 모두 홀수
        // 소인수분해 : 소수로 나누어가는 과정
        
        // Set : 중복제거
        // TreeSet : 자동으로 오름차순이 됨
        Set<Integer> set = new TreeSet<>();
        for (int i=2; i<=n; i++) {
            while (n % i == 0) {
                n /= i;
                // System.out.println(i);
                set.add(i);
            }
        }
        
        // treeSet을 int배열로 변환
        answer = set.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}