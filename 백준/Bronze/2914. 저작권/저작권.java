import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 수록곡 수
        int i = sc.nextInt(); // 평균값

        int result = (a * (i - 1)) + 1;

        System.out.println(result);
    }
}