import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int inputSum = sc.nextInt();
        
        int sum = 0;
        for (int i=1; i<=9; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
        }
        // 출력
        System.out.println(inputSum - sum);
    }
}