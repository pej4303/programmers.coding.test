import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        // 16진수 -> 10진수로 변환
        int result = Integer.parseInt(n, 16);
        
        System.out.println(result);
    }
}