import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();

            if ("#".equals(name) && age == 0 && weight == 0) {
                break;
            }

            // 나이가 17세보다 많거나, 몸무게가 80kg 이상이면
            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}