class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        
        return answer;
    }
    
    // 최대공약수 구하기 - 유클리드 호제법 사용
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수 구하기
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}