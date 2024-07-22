class Solution {
    public int solution(int hp) {
        int answer = 0;
        /*
        장군개미 : 5
        병정개미 : 3
        일개미 : 1
        */
        // 문제 : 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지
        
        int fiveAntCnt = hp / 5;
        hp %= 5;
        
        int threeAntCnt = hp / 3;
        hp %= 3;
        
        int oneAntCnt = hp / 1;
        hp %= 1;
        
        answer = fiveAntCnt + threeAntCnt + oneAntCnt;
        
        return answer;
    }
}