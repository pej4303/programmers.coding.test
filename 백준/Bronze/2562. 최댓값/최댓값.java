import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i=1; i<=9; i++) {
            int tmp = sc.nextInt();

            if (max < tmp) {
                index = i;
            }

            max = Math.max(max, tmp);
        }

        System.out.println(max);
        System.out.println(index);
    }
}