import java.io.*;
import java.util.Arrays;

public class Main {

    static int[] arr = null;

    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp1 = br.readLine().split(" ");
        String[] tmp2 = br.readLine().split(" ");

        int n = Integer.parseInt(tmp1[0]);    // 온도를 측정한 전체 날짜의 수
        int k = Integer.parseInt(tmp1[1]) - 1;    // 합을 구하기 위한 연속적인 날짜의 수(자기 자신도 포함되어서 -1)

        arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(tmp2[i]);
            // System.out.print(arr[i] + " ");
        }


        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<n-1; i++) {
            int j = i + k;
            if (j < n) {
                // 연속적인 날짜의 합 구하기
                int sum = getSum(arr, i, j);
//                System.out.print(sum + " ");
                maxSum = Math.max(maxSum, sum);
            }
        }
        // 출력
        System.out.println(maxSum);
    }

    public static int getSum(int[] arr, int startIdx, int endIndx) {
        int sum = 0;
        for (int i=startIdx; i<=endIndx; i++) {
            sum += arr[i];
        }
        return sum;
    }
}