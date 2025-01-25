import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int result = 10;    // 최종높이

        for (int i=1; i<arr.length; i++) {
            // 이전에 있는거랑 비교하기
            if (arr[i-1] == arr[i]) {
                result += 5;
            } else {
                result += 10;
            }
        }
        System.out.println(result);
    }
}