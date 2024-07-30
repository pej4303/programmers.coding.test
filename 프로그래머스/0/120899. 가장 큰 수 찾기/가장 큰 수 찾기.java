class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int max = array[0];
        answer[0] = max;
        answer[1] = 0;
        
        for (int i=1; i<array.length; i++) {
            max = Math.max(max, array[i]);
            answer[0] = max;
            if ( array[i] == max) {
                answer[1] = i;
                
                //System.out.println(answer[0]);
                //System.out.println(answer[1]);
            }
        }
        
        return answer;
    }
}