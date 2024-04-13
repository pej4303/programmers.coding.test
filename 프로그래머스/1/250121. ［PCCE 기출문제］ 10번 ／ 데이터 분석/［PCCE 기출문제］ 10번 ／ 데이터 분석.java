import java.util.*;
class Solution {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 문제 : data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
        int j = 0;
        // 데이터 순서 :  [코드 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)]

        int extIdx = getIdx(ext);
        int sortIdx = getIdx(sort_by);

        ArrayList<int[]> list = new ArrayList<>();

        // 제한사항
        if ( 1<= data.length && data.length <= 500 ) {
            for (int i=0; i<data.length; i++) {
                int tmp = data[i][extIdx];
                if ( val_ext > tmp) {
                    list.add(data[i]);
                }
            }
        }

        // 정렬
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 비교 연산자를 사용하여 비교
                return Integer.compare(o1[sortIdx],o2[sortIdx]);
            }
        });

        int[][] answer = new int[list.size()][4];
        for (int a=0; a<list.size(); a++) {
            int[] tmp = list.get(a);
            System.out.println(Arrays.toString(tmp));
            for (int b=0; b<4; b++) {
                // System.out.println(tmp[b]);
                answer[a][b] = tmp[b];
            }
        }

        return answer;
    }
    
    public static int getIdx (String type) {
        int idx = 0;
        switch (type) {
            case "code":
                idx = 0;
                break;
            case "date":
                idx = 1;
                break;
            case "maximum":
                idx = 2;
                break;
            case "remain":
                idx = 3;
                break;
        }
        return idx;
    }
}