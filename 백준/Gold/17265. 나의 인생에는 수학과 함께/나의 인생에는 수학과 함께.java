import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static String[][] arr;
    static int[][] dpMax;
    static int[][] dpMin;

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new String[n][n];
        for (int i=0; i<n; i++) {
            arr[i] = br.readLine().split(" ");
        }

        dpMax = new int[n][n];
        dpMin = new int[n][n];

        for (int[] i : dpMax) {
            Arrays.fill(i, Integer.MIN_VALUE);
        }
        for (int[] i : dpMin) {
            Arrays.fill(i, Integer.MAX_VALUE);
        }

        dpMax[0][0] = Integer.parseInt(arr[0][0]);
        dpMin[0][0] = Integer.parseInt(arr[0][0]);

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                // 연산자 칸일 때만 진행
                if (!Character.isDigit(arr[i][j].charAt(0))) {
                    // 아래로 이동
                    if (i + 1 < n && Character.isDigit(arr[i + 1][j].charAt(0))) {
                        dp(i, j, i + 1, j);
                    }
                    // 오른쪽으로 이동
                    if (j + 1 < n && Character.isDigit(arr[i][j + 1].charAt(0))) {
                        dp(i, j, i, j + 1);
                    }
                }
            }
        }
        // 출력
        System.out.println(dpMax[n - 1][n - 1] + " " + dpMin[n - 1][n - 1]);
    }

    static void dp(int pi, int pj, int x, int y) {
        String op = arr[pi][pj];
        int num = Integer.parseInt(arr[x][y]);

        // 이전 숫자 칸에서 가져오기
        for (int[] d : new int[][]{{-1, 0}, {0, -1}}) {
            int ni = pi + d[0];
            int nj = pj + d[1];

            if (0 <= ni && ni < n && 0 <= nj && nj < n && Character.isDigit(arr[ni][nj].charAt(0))) {
                int prevMax = dpMax[ni][nj];
                int prevMin = dpMin[ni][nj];

                dpMax[x][y] = Math.max(dpMax[x][y],
                        Math.max(calc(prevMax, op, num), calc(prevMin, op, num)));
                dpMin[x][y] = Math.min(dpMin[x][y],
                        Math.min(calc(prevMax, op, num), calc(prevMin, op, num)));
            }
        }
    }

    static int calc(int a, String op, int b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
        }
        return 0;
    }
}