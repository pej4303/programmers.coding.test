class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        // 치킨을 주문할 때마다 쿠폰을 받음
        while (chicken >= 10) {
            int service = chicken / 10;  // 서비스로 받은 치킨
            answer += service;
            chicken = service + (chicken % 10);  // 남은 쿠폰을 계산
        }
        
        
        
        return answer;
    }
}