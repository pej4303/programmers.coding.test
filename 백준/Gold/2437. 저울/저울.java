import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tmpArr = br.readLine().split(" ");

        int[] inputArr = new int[n];
        for (int i=0; i<n; i++) {
            inputArr[i] = Integer.parseInt(tmpArr[i]);
        }

        /**
         * 정렬 + 누적합을 이용해서 최소 무게를 구해야함
         */
        Arrays.sort(inputArr);

        int result = 1; // 현재까지 만들 수 있는 무게의 범위

        /**
         * 만약 현재 추의 무게가 result보다 작거나 같다면 result을 확장시킬 수 있음
         * 그렇지 않다면 result는 만들 수 없는 가장 작은 무게임
         */
        for (int i=0; i<n; i++) {
            // 이제 무게를 만들 수 없음
            if (inputArr[i] > result) {
                break;
            }
            result += inputArr[i];
//            System.out.println(result);
        }
        // 출력
        System.out.println(result);
    }
}