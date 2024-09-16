import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        
        if ( a > b ) {
            System.out.println(">");
        } else if ( a < b ) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }        
    }
}