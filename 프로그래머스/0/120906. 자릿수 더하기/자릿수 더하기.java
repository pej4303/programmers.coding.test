class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (String str : String.valueOf(n).split("")) {
            // System.out.println(str);
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}