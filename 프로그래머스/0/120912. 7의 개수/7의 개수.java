class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i=0; i<array.length; i++) {
            String str = String.valueOf(array[i]);
            if (str.length() == 1) {
                if (str.indexOf("7") != -1) {
                    answer++;
                }
            } else {
                for (char c : str.toCharArray()) {
                    if ( c == '7') {
                        answer++;
                    }
                } // end of for
            } // end of if
        }
        
        return answer;
    }
}