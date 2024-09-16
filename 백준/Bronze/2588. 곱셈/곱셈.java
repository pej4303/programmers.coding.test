import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String str = String.valueOf(b);
        
        System.out.println( a * Integer.parseInt(str.split("")[2]) ); // 3)
        System.out.println( a * Integer.parseInt(str.split("")[1]) ); // 4)
        System.out.println( a * Integer.parseInt(str.split("")[0]) ); // 5)
        System.out.println( a * b );  // 6)
    }
}