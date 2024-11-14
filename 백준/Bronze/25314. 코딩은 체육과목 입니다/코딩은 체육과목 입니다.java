import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int repeatCnt = n / 4;

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<repeatCnt; i++) {
            sb.append("long ");
        }
        System.out.println( sb.toString() + "int" );

    }
}