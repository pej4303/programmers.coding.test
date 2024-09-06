import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();  // 첫 번째 숫자
        int num2 = sc.nextInt();  // 두 번째 숫자
        
        System.out.println(num1 + num2);    // 첫째줄
        System.out.println(num1 - num2);    // 둘째줄
        System.out.println(num1 * num2);    // 셋째줄
        System.out.println(num1 / num2);    // 넷째줄
        System.out.println(num1 % num2);    // 다섯째줄
    }
}