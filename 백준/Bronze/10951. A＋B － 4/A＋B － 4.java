import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { // 다음줄이 있을때만 
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x+y);
        }
    }
}