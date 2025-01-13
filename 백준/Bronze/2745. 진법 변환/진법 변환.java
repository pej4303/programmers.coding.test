import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        // 진법변환
        long result = Long.parseLong(n, b);
        System.out.println(result);
    }
}