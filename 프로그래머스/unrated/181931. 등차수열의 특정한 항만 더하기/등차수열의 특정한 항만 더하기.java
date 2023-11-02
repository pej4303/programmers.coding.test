import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // 등차수열
        int[] arr = IntStream.iterate(a, i -> i + d).limit(included.length).toArray();
        // 등차수열의 합 계산
        for (int i=0; i<included.length; i++) {
            if (included[i]) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}