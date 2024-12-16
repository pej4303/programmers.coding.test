import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        // 경계선 거리 계산
        int disLeft = x;         // 왼쪽 경계선
        int disRight = w - x;   // 오른쪽 경계선
        int disBottom = y;      // 아래쪽 경계선
        int disTop = h - y;     // 위쪽 경계선
        
        int min = Math.min(Math.min(disLeft, disRight),
                                   Math.min(disBottom, disTop));
        
        System.out.println(min);
    }
}
