import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int result = 0;
        
        for (char c : str.toCharArray()) {
            if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c ) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}