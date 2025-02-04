import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int result = 0;

        //  입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cntN = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");

        if (cntN == 1) {
            result = Integer.parseInt(inputArr[0]) * Integer.parseInt(inputArr[0]);
        } else {
            int[] numArr = new int[inputArr.length];
            for (int i=0; i<inputArr.length; i++) {
                numArr[i] = Integer.parseInt(inputArr[i]);
            }

            // 배열 정렬
            Arrays.sort(numArr);
            // 약수의 최소값과 최대값을 구하기
            result = numArr[0] * numArr[numArr.length - 1];
        }
        
        // 출력
        System.out.println(result);
    }
}