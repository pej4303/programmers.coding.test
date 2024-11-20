import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;

        if (a == 60 && b == 60 && c == 60) {
            // 세 각의 크기가 모두 60이면, Equilateral
            System.out.println("Equilateral");
        } else if (sum == 180) {
            if ( a == b || b == c || c ==a) {
                // 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
                System.out.println("Isosceles");
            } else {
                // 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
                System.out.println("Scalene");
            }
        } else {
            // 세 각의 합이 180이 아닌 경우에는 Error
            System.out.println("Error");
        }
    }
}