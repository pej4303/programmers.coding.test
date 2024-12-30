import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        StringBuilder sb = null;
        
        for (int i=0; i<t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            
            sb = new StringBuilder();
            
            for (String str : s.split("")) {
                sb.append( str.repeat(r) );
            }
            
            System.out.println(sb);
        }
    }
}