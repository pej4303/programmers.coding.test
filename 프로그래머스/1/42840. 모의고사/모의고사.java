import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        // 제한사항
        // 1. 시험은 최대 10,000 문제로 구성되어있습니다.
        // 2. 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
        // 3. 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
        
        int[] math1 = {1, 2, 3, 4, 5}; // 수포자1
        int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 수포자2
        int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 수포자3
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == math1[i % math1.length]) {
                cnt1++;
            }
            if (answers[i] == math2[i % math2.length]) {
                cnt2++;
            }
            if (answers[i] == math3[i % math3.length]) {
                cnt3++;
            } 
        }
        
        // 가장 많이 맞힌 사람의 점수 찾기
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));

        // 가장 많이 맞힌 사람들 저장
        List<Integer> result = new ArrayList<>();
        if (cnt1 == max) {
            result.add(1);
        }
        if (cnt2 == max) { 
            result.add(2);
        }
        if (cnt3 == max) {
            result.add(3);
        }

        // 출력
        // : 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 
        return result.stream().mapToInt(i -> i).toArray();
    }
}