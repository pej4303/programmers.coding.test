import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 낮에 올라갈수 있는 미터
        int b = sc.nextInt(); // 밤에 내려오는 미터
        int v = sc.nextInt(); // 나무 높이

//        int day = 1;
//        int sum = 0;

        // 방법1) 시간 초과 발생
//        while (true) {
//            // 달팽이는 낮에 A미터 올라갈 수 있다.
//            sum += a;
//
//            // 정상에 이미 올라갔는지 체크
//            if (sum >= v) {
//                break;
//            }
//            // 밤에 잠을 자는 동안 B미터 미끄러진다.
//            sum -= b;
//
//            // 날짜 증가
//            day++;
//        }

        // 방법2) 
        // 총 필요한 높이에서 마지막 날의 낮을 제외한 나머지 높이를 계산
        int height = v - a; // 1

        // 하루 동안 실제로 올라가는 거리 (낮에 올라가고 밤에 미끄러짐)
        double dailyHeight = a - b; // 4

        // 나머지 높이를 하루 이동 거리로 나눈 후, 올림하여 필요한 날짜를 계산
        int day =  (int) Math.ceil(height / dailyHeight) + 1;

        // 출력
        System.out.println(day);
    }
}