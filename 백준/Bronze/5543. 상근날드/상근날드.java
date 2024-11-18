import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 햄버거값1
        int b = sc.nextInt(); // 햄버거값2
        int c = sc.nextInt(); // 햄버거값3
        int d = sc.nextInt(); // 음료수값1
        int e = sc.nextInt(); // 음료수값2

        int min1 = Math.min(a, Math.min(b, c));
        int min2 = Math.min(d, e);

        System.out.println(min1 + min2 - 50);
    }
}