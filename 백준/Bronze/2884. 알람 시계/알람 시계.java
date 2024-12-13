import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();    // 시간
        int m = sc.nextInt();    // 분

        LocalTime time = LocalTime.of(h, m);

        LocalTime result = time.minusMinutes(45);

        System.out.println( String.format("%d %d", result.getHour(), result.getMinute()) );

    }
}