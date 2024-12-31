import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        for (int i=0; i<t; i++) {
            String str = sc.nextLine();

            int sum = 0; // 누적 점수
            int cnt = 0; // 연속된 'O'의 개수
            
            for (char ch : str.toCharArray()) {
                if (ch == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }

            System.out.println(sum);
        }
    }
}
