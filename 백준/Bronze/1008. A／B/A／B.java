import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1 = sc.nextDouble();  // 첫 번째 숫자
        double num2 = sc.nextDouble();  // 두 번째 숫자
        
        System.out.println(num1 / num2);
    }
}