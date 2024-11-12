import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 팩토리얼 크기가 크지 않음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n<2) {
            // 0!, 1! => 1
            System.out.println(1);
        } else {
            int result = 1;
            for (int i=2; i<=n; i++) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}