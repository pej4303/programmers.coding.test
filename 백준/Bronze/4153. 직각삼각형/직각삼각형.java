import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = null;
        int[] numArr = new int[3];
        
        // 직각삼각형의 조건 : a2 + b2 = c2
        while (true) {
            arr = br.readLine().split(" ");
            for (int i=0; i<arr.length; i++) {
                numArr[i] = Integer.parseInt(arr[i]);
            }

            if ( numArr[0] == 0 && numArr[1] == 0 && numArr[2] == 0 ) {
                break;
            }

            Arrays.sort(numArr);

            if (Math.pow(numArr[0], 2.0) + Math.pow(numArr[1], 2.0) == Math.pow(numArr[2], 2.0)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}