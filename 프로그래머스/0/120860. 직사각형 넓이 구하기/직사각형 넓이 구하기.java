import java.util.Arrays;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 2차원 배열을 정렬
        Arrays.sort(dots, (a, b) -> {
            if (a[0] == b[0]) {
                // 첫 번째 값이 같을 때는 두 번째 값을 기준으로 정렬
                return Integer.compare(a[1], b[1]);
            } else {
                // 첫 번째 값을 기준으로 정렬
                return Integer.compare(a[0], b[0]);
            }
        });
        
        /*for (int[] dot : dots) {
            System.out.println(Arrays.toString(dot));
        }*/
        
        int x = dots[3][0] - dots[0][0];
        int y = dots[3][1] - dots[0][1];
        
        answer = x * y;
        
        return answer;
    }
}