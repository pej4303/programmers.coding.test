import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int r = 31;
        int m = 1234567891;
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();

        char[] arr = input.toCharArray();
        // int로 하면 범위 초과함 long으로 변경
        long sum = 0;
        for (int i=0; i<L; i++) {
            // a -> 1, b->2로 나옴
            int num = arr[i] - 'a' + 1;

            long a = 1;
            for (int j=0; j<i; j++) {
                // 곱하고 바로 mod 연산을 해도 결과값이 같음
                a = (a * r) % m;
            }
            // long 범위 넘지 않게 하기 위해서 mod 연산을 미리 수행함
            long tmpNum = (num * a) % m;
            sum += tmpNum;
            // long 범위 넘지 않게 하기 위해서 mod 연산을 미리 수행함
            sum %= m;
        }

        System.out.println(sum);
    }
}