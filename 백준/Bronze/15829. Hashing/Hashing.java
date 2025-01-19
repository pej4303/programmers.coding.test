import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();

        char[] arr = input.toCharArray();
        int sum = 0;
        
        for (int i=0; i<arr.length; i++) {
            // a -> 1, b->2로 나옴
            int num = arr[i] - 'a' + 1;
            // 1 * 31^0
            int tmpNum = num * (int) Math.pow(31, i);
            sum += tmpNum;
        }

        System.out.println(sum);
    }
}