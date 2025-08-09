import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String pattern = br.readLine().replace("*", ".*");
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.matches(pattern)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}