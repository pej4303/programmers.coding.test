import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        char[] arr = null;

        while (true) {
            input = br.readLine();
            if (input == null) {
                break;
            }

            long cntUpper = 0; // 대문자
            long cntLower = 0; // 소문자
            long cntNum = 0; // 숫자
            long cntSpace = 0; // 공백

            arr = input.toCharArray();

            for (char c : arr) {
                if ( Character.isUpperCase(c) ) {
                    // 대문자
                    cntUpper++;
                } else if ( Character.isLowerCase(c)) {
                    // 소문자
                    cntLower++;
                } else if ( Character.isDigit(c) ) {
                    // 숫자
                    cntNum++;
                } else {
                    // 공백
                    cntSpace++;
                }
            }
            
            // 출력
            System.out.println(String.format("%d %d %d %d", cntLower, cntUpper, cntNum, cntSpace));
        }
    }
}