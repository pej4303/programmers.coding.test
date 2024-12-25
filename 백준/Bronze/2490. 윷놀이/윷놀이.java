import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numArr = new int[4];

        for (int i=0; i<3; i++) {
            String[] strArr = br.readLine().split(" ");

            for (int j=0; j<numArr.length; j++) {
                numArr[j] = Integer.parseInt(strArr[j]);
            }

            int zeroCnt = (int) Arrays.stream(numArr).filter(e -> e == 0).count();
            int oneCnt = (int) Arrays.stream(numArr).filter(e -> e == 1).count();

            if (zeroCnt == 1 && oneCnt == 3) {
                // 도
                System.out.println("A");
            } else if (zeroCnt == 2 && oneCnt == 2) {
                // 개
                System.out.println("B");
            } else if (zeroCnt == 3 && oneCnt == 1) {
                // 걸
                System.out.println("C");
            } else if (zeroCnt == 4 && oneCnt == 0) {
                // 윷
                System.out.println("D");
            } else if (zeroCnt == 0 && oneCnt == 4) {
                // 모
                System.out.println("E");
            }
        }
    }
}