import java.util.*;
class Solution {
   class Stage {
        int index;
        double rate;

        Stage(int index, double rate) {
            this.index = index;
            this.rate = rate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        /* 설계 흐름 */
        // 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
        // 테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
        
        /*
        0. Stage 클래스 선언, Stage 타입의 List 선언
        1. 스테이지 개수 만큼 for문 수행
        2. 실패율 로직 처리
         - 해당 index와 동일한 번호가 있으면 실패율 계산
         - 없다면 도달한 유저가 없는것으로 실패율을 0으로 정의
         - list에 담기
        3. list 정렬
         - 실패율 내림차순 같으면 스테이지 오름차순
        4. list -> int[] 변환
        5. answer 반환
        */
        
        
       List<Stage> list = new ArrayList<>();
       // 1. 스테이지 개수 만큼 for문 수행
       for (int i=1; i<=N; i++) {
           // 실패율 계산
           double rate = calc(stages, i);
           // list에 담기
           list.add(new Stage(i, rate));
       }
        
       // 3. list 정렬
       // 실패율 내림차순, 같으면 스테이지 오름차순
       Collections.sort(list, (a, b) -> {
            if (Double.compare(b.rate, a.rate) == 0) {
                return a.index - b.index;   // 스테이지 번호 오름차순
            } else {
                return Double.compare(b.rate, a.rate);  // 실패율 내림차순
            }
       });
       
        
       // 4. list -> int[] 변환
       answer = list.stream().mapToInt(stage -> stage.index).toArray();
        
       return answer;
    }
    
    
    private double calc(int[] stages, int stage) {
        int fail = 0;
        int sucess = 0;

        for (int i=0; i<stages.length; i++) {
            if (stages[i] >= stage) { // 해당 스테이지에 도달한 사용자
                sucess++;
            }
            if (stages[i] == stage) { // 해당 스테이지에서 실패한 사용자
                fail++;
            }
        }

        if (sucess == 0) {
            return 0.0;
        } else {
            return (double) fail / sucess;
        }
    }

}