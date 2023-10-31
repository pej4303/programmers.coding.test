class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int num1 = Integer.valueOf(String.valueOf(a) + b);
        int num2 = Integer.valueOf(String.valueOf(b) + a);
        
        answer = Integer.max(num1,num2);
        
        return answer;
    }
}