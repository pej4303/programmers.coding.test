package com.study.programmers.coding.test;


import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] data = {
            {1, 20300104, 100, 80},
            {2, 20300804, 847, 37},
            {3, 20300401, 10, 8},
        };
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] result = solution(data, ext, val_ext, sort_by);

        Arrays.stream(result).forEach(i -> System.out.println(Arrays.toString(i)));
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
            for (int b=0; b<4; b++) {
                answer[a][b] = tmp[b];
            }
        }

        return answer;
    }

    @Test
    void test1() {
        int[][] answer = {};
        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8},
        };

        List<int[]> list = new ArrayList<>();

        for (int i=0; i<data.length; i++) {
            list.add(data[i]);
        }


        final int j = 1;

//        list.stream().sorted(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                // 비교 연산자를 사용하여 비교
//                return Integer.compare(o2[j], o1[j]);
//            }
//        });

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 비교 연산자를 사용하여 비교
                return Integer.compare(o2[j], o1[j]);
            }
        });

        list.forEach(i -> System.out.println(Arrays.toString(i)));

        for (int a=0; a<list.size(); a++) {
            int[] tmp = list.get(a);
            for (int b=0; b<4; b++) {
                answer[a][b] = tmp[b];
            }
        }
    }

    @Test
    void test2() {
        String s = "one4seveneight";
        int result = 1478;
        int answer = 0;

        StringBuffer sb = new StringBuffer();

        Map<String, Integer> map = new HashMap<>();
        map.put( "zero"  , 0);
        map.put( "one"   , 1);
        map.put( "two"   , 2);
        map.put( "three" , 3);
        map.put( "four"  , 4);
        map.put( "five"  , 5);
        map.put( "six"   , 6);
        map.put( "seven" , 7);
        map.put( "eight" , 8);
        map.put( "nine"  , 9);

        if (1 <= s.length() && s.length() <= 50) {
            // while (tmp != -1) {
            for (String key : map.keySet()) {
                int value = map.get(key);
                // System.out.println("Key: " + key + ", Value: " + value);
//                System.out.println(s.indexOf(value));
                if (s.indexOf(key) != -1) {

                    sb.append(String.valueOf(value));
                    s = s.replace(key, "");
                }
                if (s.indexOf(String.valueOf(value)) != -1) {
                    sb.append(String.valueOf(value));
                    s.replace(String.valueOf(value), "");
                }

                System.out.println(sb.toString());
            }
            // }

            System.out.println(sb.toString());
        }
    }
}
