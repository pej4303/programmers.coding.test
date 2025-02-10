import java.util.*;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = null;

        // 입력
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            // 원래의 수와 뒤집은 수가 같으면 팰린드롬수
            sb = new StringBuilder(String.valueOf(num));
            if ( String.valueOf(num).equals(sb.reverse().toString()) ) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
