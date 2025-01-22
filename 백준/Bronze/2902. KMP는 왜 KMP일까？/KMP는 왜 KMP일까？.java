import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        // "-" 기준으로 배열로 나눈다음 첫번째 자리만 출력
        String[] arr = input.split("-");
        for (String s : arr) {
            System.out.print(s.charAt(0));
        }
    }
}