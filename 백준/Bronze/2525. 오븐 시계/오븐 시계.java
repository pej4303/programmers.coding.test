import java.time.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int addM = sc.nextInt();

        LocalTime time = LocalTime.of(h, m);

        LocalTime result = time.plusMinutes(addM);

        System.out.println( String.format("%d %d", result.getHour(), result.getMinute()) );
    }
}