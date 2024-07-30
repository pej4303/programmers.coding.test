class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        // 2칸씩 이동하는 계산의 공식:  (2 * (K - 1)) % numbers.length
        /*
         * 2: 각 던짐에서 이동하는 칸 수
         * K - 1 : 처음 시작한 사람을 제외하고 공이 던져진 횟수
         * % n : 배열의 끝에 도달하면 다시 처음으로 돌아가기 위해 사용되는 나머지 연산
         */
        int index = (2 * (k - 1)) % numbers.length;
        //System.out.println(numbers[index]);
        
        answer = numbers[index];
        
        return answer;
    }
}