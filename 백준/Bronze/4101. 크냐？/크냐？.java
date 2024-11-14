import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x == 0 && y ==0) {
                break;
            }
            
            // 각 테스트 케이스마다, 첫 번째 수가 두 번째 수보다 크면 Yes를, 아니면 No를 한 줄에 하나씩 출력한다.
            System.out.println( (x > y) ? "Yes" : "No" );
            
        }
    }
}