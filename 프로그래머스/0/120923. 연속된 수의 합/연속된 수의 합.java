import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        /*
        for (int i=0; i<=1000; i++) {
            int endNum = i + num;
            int sum = IntStream.range(i, endNum).sum();
            
            int minusEndNum = i - num;
            int sum2 = IntStream.range(i, minusEndNum).sum();
            
            if (sum == total) {
                answer = IntStream.range(i, endNum).toArray();
                break;
            }
            if (sum2 == total) {
                System.out.println(minusEndNum);
                answer = IntStream.range(i, endNum).toArray();
                break;
            }
        }
        */
        int s = (total * 2 / num - num + 1 ) / 2;
        
        for (int i=0; i<num; i++) {
            answer[i] = s + i;
        }
        
        return answer;
    }
}