import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int len = str.length();
        
        for (int i=0; i<len; i+=10) {
            System.out.println( str.substring(i, Math.min(i+10, len)));
        }
    }
}