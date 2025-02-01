import java.time.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        LocalDate localDate = LocalDate.of(2007, x, y);
        // 출력
        System.out.println(localDate.getDayOfWeek().name().substring(0, 3));
    }

}