import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] input = null;

        for (int i=1; i<=3; i++) {
            input = sc.nextLine().split(" ");

            int h1 = Integer.parseInt(input[0]);
            int m1 = Integer.parseInt(input[1]);
            int s1 = Integer.parseInt(input[2]);

            LocalTime t1 = LocalTime.of(h1, m1, s1);

            int h2 = Integer.parseInt(input[3]);
            int m2 = Integer.parseInt(input[4]);
            int s2 = Integer.parseInt(input[5]);

            LocalTime t2 = LocalTime.of(h2, m2, s2);

            Duration duration = Duration.between(t1, t2);
            long tmpD = Math.abs(duration.getSeconds());

            // 시간, 분, 초로 변환
            long hours = tmpD / 3600;
            long minutes = (tmpD % 3600) / 60;
            long seconds = tmpD % 60;

            // 결과 출력
            System.out.println(String.format("%d %d %d", hours, minutes, seconds));
        }
    }
}
