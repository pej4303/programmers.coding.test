import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
        }
        // 정렬
        Arrays.sort(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int num : arr) {
            bw.write(num + "\n");
        }

        bw.flush();
    }
}