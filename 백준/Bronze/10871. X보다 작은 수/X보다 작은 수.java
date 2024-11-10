import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력조건에 만개정도여서 그냥 Scanner로 이용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        for (int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            
            if ( x > tmp ) {
                // 출력형식이 잘못되었다는 오류 발생
                // System.out.println(tmp+" ");
                System.out.printf("%s ", tmp);
            }
        }
    }
}