class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] ageArr = "abcdefghijklmnopqrstuvwxyz".split("") ;
        
        if ( age <= 1000) {
            String ageToStr =  Integer.toString(age);
            for ( String str : ageToStr.split("") ) {
                answer += ageArr[Integer.parseInt(str)];
            }
        }
        
        return answer;
    }
}