import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // char -> int로 바꾸면 아스키코드로 출력 가능
        System.out.println( (int)str.charAt(0) );

        // int -> char로 바꾸면 아스키코드를 문자로 출력 가능
//        int n = sc.nextInt();
//        System.out.println( (char) n);
    }
}