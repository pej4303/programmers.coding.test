import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     
        // 1번 : 3
        // 2번 : 5
        // 3번 : 9
        // 4번 : 17
        // 5번 : 33
        /*long result = 1 + (long) Math.pow(2, n);*/
        int result = (int) Math.pow( Math.pow(2, n) +1, 2);
        System.out.println(result);
        
    }
}