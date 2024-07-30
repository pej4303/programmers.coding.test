class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        // (가로/N) * (세로/N) * (높이/N)
        int num1 = box[0] / n;
        int num2 = box[1] / n;
        int num3 = box[2] / n;
        
        answer = num1 * num2 * num3;
        
        return answer;
    }
}