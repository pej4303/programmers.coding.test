import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr = null;
    static int whiteCnt = 0;    // 하얀색 개수
    static int blueCnt = 0; // 파란색 개수
    public static void main(String[] args) throws IOException {
        StringTokenizer st = null;
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 해당 영역이 모두 같은 색인지 확인
        cutArea(0, 0, n);

        System.out.println(whiteCnt);
        System.out.println(blueCnt);
    }

    private static void cutArea(int x, int y, int size) {
        boolean isSame = checkColor(x, y, size);

        if (isSame) {
            // 해당 영역이 모두 같은 색이라면
            if (arr[x][y] == 0) {
                whiteCnt++;
            } else {
                blueCnt++;
            }
        } else {
            // 분할
            size = size / 2;

            cutArea(x, y, size);
            cutArea(x+size, y, size);
            cutArea(x, y+size, size);
            cutArea(x+size, y+size, size);
        }
    }


    // 해당 영역이 모두 같은 색인지 확인
    private static boolean checkColor(int x, int y, int size) {
        // 기준 컬러
        int color = arr[x][y];

        for (int i=x; i<x+size; i++) {
            for (int j=y; j<y+size; j++) {
                if (color != arr[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}