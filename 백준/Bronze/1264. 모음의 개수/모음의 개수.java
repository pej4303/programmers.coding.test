import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            int result = 0;

            if ("#".equals(str)) {
                break;
            }

            for (char c : str.toLowerCase().toCharArray()) {
                if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c) {
                    result++;
                }
            }

            System.out.println(result);
        }
    }
}