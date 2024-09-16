import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        long a = Long.parseLong(str.split(" ")[0]);
        long b = Long.parseLong(str.split(" ")[1]);
        long c = Long.parseLong(str.split(" ")[2]);
        
        System.out.println( a + b + c );
    }
}