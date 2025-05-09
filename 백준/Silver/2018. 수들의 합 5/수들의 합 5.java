import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 1;

        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;

        while (endIdx != n) {
            if (sum == n) {
                result = result + 1;
                endIdx = endIdx + 1;
                sum = sum + endIdx;
            } else if (sum > n) {
                sum = sum - startIdx;
                startIdx = startIdx + 1;
            } else {
                endIdx = endIdx + 1;
                sum = sum + endIdx;
            }
        }

        System.out.println(result);
    }
}
