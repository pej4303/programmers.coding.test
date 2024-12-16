import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            // 층 번호 계산
            int floor = n % h == 0 ? h : n % h;
            // 방 번호 계산
            int room = (n - 1) / h + 1;

            System.out.printf("%d%02d\n", floor, room);
        }
    }
}