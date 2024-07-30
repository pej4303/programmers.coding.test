class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        //System.out.println(my_string);
        
        for (String str : my_string.split("")) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}