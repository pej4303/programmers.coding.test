import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            // \s : 공백문자
            int count = str.split("\\s+").length;
            System.out.println(count);
        }
    }
}