import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // InputStreamReader : Byte 스트림 -> 문자(char) 스트림으로 변환하는 역할을 하는 클래스
        // BufferedReader : 문자 기반 스트림(Reader)에서 데이터를 읽을 때 버퍼링을 추가하여 효율적으로 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        String[] arr = null;

        for (int i=1; i<=t; i++) {
            arr = br.readLine().split(",");
            bw.write( Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
        }

        bw.flush();
    }
}