import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("\\*");

        // 2. 로직
        for (int i=0; i<n; i++) {
            String text = br.readLine();
            // 3. startsWith와 endsWith로 앞부분, 뒷부분 비교
            if ( text.length() >= arr[0].length() + arr[1].length() &&
                    text.startsWith(arr[0]) && text.endsWith(arr[1]) ) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}