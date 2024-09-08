class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (String[] arr : db) {
            if ( id_pw[0].equals(arr[0]) ) {
                if (id_pw[1].equals(arr[1])) {
                    answer = "login";    
                } else {
                    answer = "wrong pw";    
                }
                break;
            }
        }
        
        if (answer.isEmpty()) {
            answer = "fail";
        }
        
        return answer;
    }
}