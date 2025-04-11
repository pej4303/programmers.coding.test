import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);  // 세로
        int m = Integer.parseInt(tmp[1]);  // 가로

        int result = 0;

        if (n == 1) {
            // 이동 불가, 시작칸만 방문
            result = 1;
        } else if (n == 2) {
            // 위아래 이동이 안되니, (1,2), (-1,2)만 사용 가능 => 4번까지만 가능
            result = Math.min(4, (m + 1) / 2);
        } else if (n >= 3 && m < 7) {
            // 위아래는 충분하지만 오른쪽 이동이 부족해서 4가지 이동을 다 못 씀
            result = Math.min(4, m);
        } else {
            // 4가지 이동 다 사용 가능
            result = m - 2;
        }

        // 출력
        System.out.println(result);
    }
}