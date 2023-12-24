class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int iceAmericano = 5500;
        
        if (0 < money && money <= 1_000_000) {
            answer[0] = money / iceAmericano;
            answer[1] = money - (iceAmericano * answer[0]);
        }
        
        return answer;
    }
}