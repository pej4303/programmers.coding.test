class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = 0;
        
        for (String str : String.valueOf(x).split("")) {
            tmp += Integer.parseInt(str);
        }
        
        answer = (x % tmp == 0) ? true : false;
            
        return answer;
    }
}