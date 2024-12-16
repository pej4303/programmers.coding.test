import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] numArr = new int[3];

        for (int i=0; i<numArr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numArr);

        System.out.println(numArr[1]);

    }
}