import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String input = br.readLine();
        
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += input.charAt(i) - '0';
        }
        
        // 출력
        // : 입력으로 주어진 숫자 N개의 합
        System.out.println(sum);
    }
}