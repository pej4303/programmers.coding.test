import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];

        for (int i=0; i<5; i++) {
            String line = br.readLine();
            for (int j=0; j<line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        // 출력
        for (int j=0; j<15; j++) {
            for (int i=0; i<5; i++) {
                // null문자, 공백 제거
                if ( arr[i][j] != '\0' ) {
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}