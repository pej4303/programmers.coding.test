import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        long answer = 0;

        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        StringBuilder sb = new StringBuilder();
        while (numbers.length() > 0) {
            for (String key : map.keySet()) {
                if (numbers.startsWith(key)) {
                    sb.append(map.get(key));
                    numbers = numbers.substring(key.length());
                    // numbers = numbers.replace(key, "");
                    break;  // 키를 찾았으니 내부 for문을 빠져나옴
                }
            }
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
