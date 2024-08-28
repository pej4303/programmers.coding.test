import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        
        // 평균 배열 생성
        double[] avgArr = new double[n];
        for (int i=0; i<n; i++) {
            avgArr[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        // 학생의 인덱스와 평균을 함께 저장할 배열 생성
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i] = i;
        }

        // 평균을 기준으로 내림차순 정렬
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Double.compare(avgArr[o2], avgArr[o1]);
            }
        });

        // 등수 매기기
        int rank = 1;
        for (int i=0; i<n; i++) {
            if (i > 0 && avgArr[arr[i]] == avgArr[arr[i - 1]]) {
                answer[arr[i]] = answer[arr[i - 1]]; // 동일한 평균이면 이전 학생과 동일한 등수
            } else {
                answer[arr[i]] = rank;
            }
            rank++;
        }

        return answer;
    }
}
