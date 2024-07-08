class Solution {
    public int solution(int num) {
        int answer = 0;
        long tmpNum = num;
        
        if (num == 1) {
            return 0;
        }
        
        if (num >= 1 && num <= 8_000_000) {
            while (true) {
                tmpNum = (tmpNum % 2 == 0) ? tmpNum / 2 : tmpNum * 3 + 1;
                answer++;

                if (answer > 500) {
                    answer = -1;
                    break;
                }
                if (tmpNum == 1) {
                    // System.out.println("반복횟수 : " + answer);
                    break;
                }
            }
        } 
        
        return answer;
    }
}