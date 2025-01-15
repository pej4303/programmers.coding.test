import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        // ax + by = c
        // dx + ey = f
        for (int x=-999; x<=999; x++) {
            for (int y=-999; y<=999; y++) {
                if ( (a * x ) + (b * y) == c && (d * x) + (e * y) == f ) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}