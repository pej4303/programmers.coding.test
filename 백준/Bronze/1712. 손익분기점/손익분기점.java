import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   // 고정비용
        int b = sc.nextInt();   // 가변비용
        int c = sc.nextInt();   // 판매가격

        if ( b >= c) {
            System.out.println(-1);
        } else {
            // 판매량 x 판매가격(C) > 고정비용(A) + (판매량 x 가변비용(B))
            // => 고정비용(A) = 판매량 x 판매가격(C) - (판매량 x 가변비용(B))
            // => 고정비용(A) = 판매량 x (판매가격(C) - 가변비용(B))
            // => 판매량 = 고정비용(A) / (판매가격(C) - 가변비용(B))

            System.out.println( (a / (c-b)) + 1);
        }
    }
}