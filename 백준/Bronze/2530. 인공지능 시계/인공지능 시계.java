import java.time.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int time = sc.nextInt();

        LocalTime currentTime = LocalTime.of(h, m, s);

        // 시간 계산
        LocalTime addTime = currentTime.plusSeconds(time);
        // 출력
        System.out.printf("%d %d %d%n", addTime.getHour(), addTime.getMinute(), addTime.getSecond());
    }
}