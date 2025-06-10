class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
    
        int minBill = Math.min(bill[0], bill[1]);
        int maxBill = Math.max(bill[0], bill[1]);
        int minWallet = Math.min(wallet[0], wallet[1]);
        int maxWallet = Math.max(wallet[0], wallet[1]);
        
        // 1. 반복문을 이용해 bill의 작은 값이 wallet의 작은 값 보다 크거나 bill의 큰 값이 wallet의 큰 값 보다 큰 동안 아래 과정을 반복합니다.
        while (minBill > minWallet || maxBill > maxWallet) {
            if (bill[0] > bill[1]) {
                // 2-1. bill[0]이 bill[1]보다 크다면 bill[0]을 2로 나누고 나머지는 버립니다.
                bill[0] /= 2;
            } else {
                // 2-2. 그렇지 않다면 bill[1]을 2로 나누고 나머지는 버립니다.    
                bill[1] /= 2;
            }
            // 최소값, 최대값 갱신
            minBill = Math.min(bill[0], bill[1]);
            maxBill = Math.max(bill[0], bill[1]);
            
            // 2-3. answer을 1 증가시킵니다.
            answer++;
            
        }
        return answer;
    }
}