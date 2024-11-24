import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        /*
         * 반례)
         * 입력 : 2, 17
         * 출력 : 아무것도 안 나옴
         */
        /*if ( month < 2 && day < 18 ) {
            System.out.println("Before");
        } else if ( month > 2 && day > 18 ) {
            System.out.println("After");
        } else if ( month == 2 && day == 18 ) {
            System.out.println("Special");
        }*/

        if ( month < 2 ) {
            System.out.println("Before");
        } else if ( month == 2 ) {
            if ( day > 18 ) {
                System.out.println("After");
            } else if ( day < 18 ) {
                System.out.println("Before");
            } else {
                System.out.println("Special");
            }
        } else if ( month > 2 ) {
            System.out.println("After");
        }
    }
}