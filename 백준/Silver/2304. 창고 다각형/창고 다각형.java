
import java.io.*;
import java.util.*;
public class Main {
    static class Store {
        int L;
        int H;

        int getH() {
            return this.H;
        }

        int getL() {
            return this.L;
        }

        Store(int L, int H) {
            this.L = L;
            this.H = H;
        }
    }

    public static void main(String[] args) throws Exception {
        StringTokenizer st = null;
        int result = 0;

        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 기둥의 개수
        int n = Integer.parseInt(br.readLine());

        // 2. L, H를 클래스로 List에 저장
        List<Store> list = new ArrayList<>();

        int maxH = -1;
        int index = -1;

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            int tmpL = Integer.parseInt(st.nextToken());
            int tmpH = Integer.parseInt(st.nextToken());

            maxH = Math.max(maxH, tmpH);

            list.add(new Store(tmpL, tmpH));
        }

        // 3. L 기준 정렬
        list.sort((a,b) -> Integer.compare(a.L, b.L));

        // 4. 최고높이 index 위치 찾기
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getH() == maxH) {
                index = i;
                break;
            }
        }

        // 5. 로직 처리
        // - 현재 높이가 최대높이보다 크면 면적구하기
        // 왼쪽 ~ 최대높이
        int leftH = list.get(0).getH();
        int leftL = list.get(0).getL();

        for (int i=1; i<= index; i++) {
            if (list.get(i).getH() >= leftH) {
                result += (list.get(i).getL() - leftL) * leftH;

                leftH = list.get(i).getH();
                leftL = list.get(i).getL();
            }
        }
        // 최대높이 ~ 오른쪽
        int rightH = list.get(list.size() -1).getH();
        int rightL = list.get(list.size() -1).getL();

        for (int i=list.size() -2; i>= index; i--) {
            if (list.get(i).getH() >= rightH) {
                result += (rightL - list.get(i).getL()) * rightH;

                rightH = list.get(i).getH();
                rightL = list.get(i).getL();
            }
        }

        result += maxH;  // 기둥 하나만큼의 면적 추가

        // 6. 출력
        System.out.println(result);
    }
}