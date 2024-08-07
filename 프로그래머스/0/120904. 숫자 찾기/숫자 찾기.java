class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        // 유효성검사
        if ( 0 > num || num > 1_000_000) {
            return answer;
        }
        if ( 0 > k || k > 10) {
            return answer;
        }
        
        String[] arr = String.valueOf(num).split("");
            
        for (int i=0; i<arr.length; i++) {
            // System.out.println( arr[i].indexOf(String.valueOf(k)) );
            // 똑같이 문자 타입으로 맞춰줘야함
            if (arr[i].indexOf(String.valueOf(k)) != -1 ) {
                answer = i+1;
                break;
            }
        }
       
        return (answer == 0) ? -1 : answer;
    }
}