class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.valueOf("" + a + b);
        int num2 = 2 * a * b;
        
        return Integer.max(num1,num2);
    }
}