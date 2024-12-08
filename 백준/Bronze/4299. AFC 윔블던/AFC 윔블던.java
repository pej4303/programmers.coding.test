import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 합
        int b = sc.nextInt(); // 차

        // 연립방정식을 이용
        int x = (a+b)/2;
        int y = (a-b)/2;

        if ( b>a ) {
            System.out.println(-1);
        } else {
            if (x+y == a && x-y == b){
                System.out.println(String.format("%d %d", x, y));
            } else {
                System.out.println(-1);
            }
        }
    }
}