import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();

        for (int i=0; i<Integer.parseInt(n); i++) {
            String str = br.readLine();
            System.out.println(str.toLowerCase());
        }
    }
}