import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        // 이용금액 구하기
        long playMoneySum = 0;
        for (int i=1; i<=count; i++) {
            playMoneySum += price * i;
        }
        // System.out.println("playMoneySum =" + playMoneySum);
        
        // 얼마 모자라는지 계산하기
        long diff = money - playMoneySum;
        if (diff >= 0 ) {
            answer = 0;
        } else {
            answer = diff * -1;
        }
        
        return answer;
    }
}