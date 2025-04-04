import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        // 입력
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬 (Arrays.sort()가 기본적으로 퀵소트와 병합정렬을 조합하여 사용)
        Arrays.sort(arr);

        // 출력 (BufferedWriter 사용)
        for (int num : arr) {
            bw.write(num + "\n");
        }
        
        bw.flush(); // 출력 버퍼 비우기
        br.close();
        bw.close();
    }
}