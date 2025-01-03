import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int room = 1;   // 1번방부터 시작
        int index = 1;  // 최소 개수방

        while (n > room) {
            room += index * 6;
            index++;
        }

        System.out.println(index);
    }
}