import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        long result = 0;
        
        /**
         * - 가 있다면 -를 기준으로 괄호를 하면 최솟값을 만들수 있음
         * +만 있다면 최솟값 = 최대값 이다.
         */
        
        // "-" 기준으로 문자열 자르기
        String[] arr = input.split("-");
        // 첫번째는 더하기
        result += calcSum(arr[0]);

        // 두번째부터는 더한 값을 빼줌
        for (int i=1; i <arr.length; i++) {
            result -= calcSum(arr[i]);
        }
        // 출력
        System.out.println(result);
    }

    private static int calcSum(String str) {
        int sum = 0;
        String[] numArr = str.split("\\+");

        for (String num : numArr) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}