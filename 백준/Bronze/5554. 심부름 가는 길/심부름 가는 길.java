import java.time.LocalTime;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i=0; i<4; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
        }

        LocalTime t = LocalTime.ofSecondOfDay(sum);
        
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
    }
}