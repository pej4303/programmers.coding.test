import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        
        // 유클리드 기하학에서 원의 넓이 : 반지름 * 반지름 * 파이
        System.out.println( r * r * Math.PI);
        // 택시 기하학(Manhattan Geometry)에서 원의 넓이 : 2 * 반지름 * 반지름
        System.out.println( 2 * r * r);
    }
}