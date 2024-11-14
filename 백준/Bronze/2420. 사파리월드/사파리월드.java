import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int형은 최대 범위은 -21억 ~ 21억으로 현재 범위를 초과하지 않지만 long으로 하는게 좋음
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        System.out.println(Math.abs(n-m));
    }
}