import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // 최대 사람 수
        int prePeople = 0; // 현재 열차의 사람 수

        for (int i=1; i<=4; i++) {
            int out = sc.nextInt(); // 내린 사람 수
            int in = sc.nextInt();  // 탄 사람 수

            // 열차에 남아 있는 사람 수 계산
            prePeople = prePeople - out + in;

            // 최대값 갱신
            max = Math.max(max, prePeople);

        }

        System.out.println(max);
    }
}