import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        Scanner sc = new Scanner(System.in);
        // 0 1 2 2 2 7

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        int num1 = sc.nextInt();// 킹
        int num2 = sc.nextInt();// 퀸
        int num3 = sc.nextInt();// 룩
        int num4 = sc.nextInt();// 비숍
        int num5 = sc.nextInt();// 나이트
        int num6 = sc.nextInt();// 폰

        System.out.println(String.format("%d %d %d %d %d %d"
                , king-num1
                , queen - num2
                , rook - num3
                , bishop - num4
                , knight - num5
                , pawn - num6
        ));
    }
}