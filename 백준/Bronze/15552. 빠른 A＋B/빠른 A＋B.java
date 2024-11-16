import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner 이용시 시간초과 발생
        /*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i=0; i<t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x+y);
        }
        */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            // 한 줄씩 읽어서
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            bw.write(x + y + "\n");
        }

        bw.flush();

        bw.close();
        
    }
}