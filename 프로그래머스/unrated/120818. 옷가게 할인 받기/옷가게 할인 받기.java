class Solution {
    public int solution(int price) {
        int answer = 0;
        boolean isValide = false;
        
        if (10 <= price && price <= 1_000_000) {
            isValide = true;
        }

        if ( isValide) {
            if ( price >= 500000) {
                answer = (int) (price * 0.8);
            } else if (price < 500000 && price >= 300000) {
                answer = (int) (price * 0.9);
            } else if (price < 300000 && price >= 100000) {
                answer = (int) (price * 0.95);
            } else if (price < 100000) {
                answer = price;
            }
        }
        
        return answer;
    }
}