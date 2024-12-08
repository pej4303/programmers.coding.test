import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        double pie = 3.141592; 
        
        // 원의 둘레 : 2 * 파이 * 반지름
        System.out.println( (d1 * 2) +  (2 * pie * d2) );
    }
}