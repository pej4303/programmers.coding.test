import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer sb = null;

        while (true) {
            String str = sc.nextLine();
            if ("END".equals(str)) {
                break;
            }

            sb = new StringBuffer();
            for (char c : str.toCharArray()) {
                sb.append(c);
            }

            System.out.println(sb.reverse());
        }
    }
}