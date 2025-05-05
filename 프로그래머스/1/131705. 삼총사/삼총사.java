class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다.
        
        // 방법1) 완전 탐색으로 모든 경우의 수를 찾기
        // Q. 완전 탐색으로 풀때 시간복잡도가 증가하지 않을까?
        for (int i=0; i<number.length - 2; i++) {
            // System.out.println("i = " + i);
            for (int j=i+1; j<number.length - 1; j++) {
                for (int k=j+1; k<number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }       
                }
            }
        }
        
        // 출력
        // : 한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수
        return answer;
    }
}