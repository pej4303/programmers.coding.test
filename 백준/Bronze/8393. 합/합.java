import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = IntStream.rangeClosed(1, n).sum();

        System.out.println(sum);
    }
}
