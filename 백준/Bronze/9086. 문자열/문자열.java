import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i=0; i<t; i++) {
            String str = sc.nextLine();
            if (str.length() < 2) {
                System.out.println( str.repeat(2) );
            } else {
                System.out.println( str.substring(0,1) + str.substring(str.length() - 1) );
            }

        }
    }
}


