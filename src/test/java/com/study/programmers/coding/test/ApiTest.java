package com.study.programmers.coding.test;

import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONArray;
import org.json.JSONObject;

public class ApiTest {
    public static void main(String[] args) {
        String ipAddress = "0.0.0.0"; // 서버 IP 주소
        int port = 5678; // 서버 포트

        try {
            // HttpServer 생성 및 설정
            HttpServer server = HttpServer.create(new InetSocketAddress(ipAddress, port), 0);
            // 핸들러 설정
            server.createContext("/", new ApiResponseHandler());
            server.createContext("/sum", new ApiResponseHandler());
            // 기본 executor 사용
            server.setExecutor(null);

            // 서버 시작
            server.start();

        } catch (Exception e) {

        }
    }

    static class ApiResponseHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) {
            try {
                // 요청 메서드 확인
                if (exchange.getRequestMethod().equalsIgnoreCase("GET")) {
                    JSONObject jsonObject = new JSONObject();

                    if ( exchange.getHttpContext().getPath().equals("/sum") ) {
                        int postCntSum = getPostCount();
                        jsonObject.put("sum", postCntSum);
                    } else {
                        jsonObject.put("message", "server check");
                    }

                    // 응답 데이터 설정
                    String response = jsonObject.toString();

                    exchange.sendResponseHeaders(200, response.getBytes().length);

                    // 응답 보내기
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                } else {
                    // 지원하지 않는 메서드일 경우 405 Method Not Allowed 응답 보내기
                    exchange.sendResponseHeaders(405, -1);
                }
            } catch (Exception e) {

            }
        }
    }

    static int getPostCount() {
        String filePath = "data/input/user.json"; // JSON 파일 경로
        int sum = 0; // post_count의 합계 변수

        try {
            // JSON 파일 읽기
            FileInputStream inputStream = new FileInputStream(filePath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
            inputStream.close();

            // JSON 파싱
            JSONArray jsonArray = new JSONArray(sb.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                sum += jsonObject.getInt("post_count");
            }

        } catch (Exception e) {
            sum = -1;
        }

        return sum;
    }
}
