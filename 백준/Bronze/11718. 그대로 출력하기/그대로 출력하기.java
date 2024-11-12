import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hasNext : 공백을 기준
        // hasNextLine : 줄 기준
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
    }
}