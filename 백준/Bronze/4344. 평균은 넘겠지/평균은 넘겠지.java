import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        String[] inputArr = null;
        for (int i=1; i<=c; i++) {
            inputArr = br.readLine().split(" ");

            int sum = 0;       // 점수 총합
            double avg = 0.0;  // 평균값
            int cnt = 0;       // 평균을 넘는 학생들 수

            for (int j=1; j<inputArr.length; j++) {
                sum += Integer.parseInt(inputArr[j]);
            }

            // 평균값 계산
            avg = sum / Double.parseDouble(inputArr[0]);
//            System.out.println("avg = " + avg);

            // 평균을 넘는 학생들 수 계산
            for (int k=1; k<inputArr.length; k++) {
                if ( avg < Integer.parseInt(inputArr[k])) {
                    cnt++;
                }
            }

            double ratio = cnt / Double.parseDouble(inputArr[0]) * 100;

            // 출력
            System.out.println( String.format("%.3f%%", ratio) );
        }

    }
}