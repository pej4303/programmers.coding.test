class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int width = 0;
        int height = 0;
        int max = 0;
        int min = 0;
        
        for (int i=0; i<sizes.length; i++) {
            max = Math.max(sizes[i][0], sizes[i][1]);
            min = Math.min(sizes[i][0], sizes[i][1]);
            
            width = Math.max(max, width);
            height = Math.max(min, height);
        }
        
        answer = width * height;
        
        return answer;
    }
}