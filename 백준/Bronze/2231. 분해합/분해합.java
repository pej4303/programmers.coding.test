import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 생성자

        int result = 0;

        // 방법1) 10부터 시작해서 n이 될때까지 계속 순회하는 방법 => 시간초과 발생
        /*if (n < 10) {
            System.out.println(result);
        } else {
            int i = 10;
            while (true) {
                int tmp = i;

                String[] arr = String.valueOf(tmp).split("");
                for (String str : arr) {
                    tmp += Integer.parseInt(str);
                }
                if (n == tmp) {
                    result = i;
                    break;
                }

                i++;
            }

            System.out.println(result);
        }*/

        // 방법2) while문 대신 메소드를 분리하는 방법
        for (int i=1; i<n; i++) {
            if (n == checkSum(i)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
    
    private static int checkSum(int num) {
        int sum = num;

        String[] arr = String.valueOf(sum).split("");
        for (String str : arr) {
            sum += Integer.parseInt(str);
        }

        return sum;
    }
}