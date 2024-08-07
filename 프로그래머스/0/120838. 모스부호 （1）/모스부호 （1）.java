import java.util.HashMap;

class Solution {   
    public String solution(String letter) {
        // 모스부호
        HashMap<String, String> morseMap = new HashMap<>();
        morseMap.put(".-"  , "a");
        morseMap.put("-...", "b");
        morseMap.put("-.-.", "c");
        morseMap.put("-.." , "d");
        morseMap.put("."   , "e");
        morseMap.put("..-.", "f");
        morseMap.put("--." , "g");
        morseMap.put("....", "h");
        morseMap.put(".."  , "i");
        morseMap.put(".---", "j");
        morseMap.put("-.-" , "k");
        morseMap.put(".-..", "l");
        morseMap.put("--"  , "m");
        morseMap.put("-."  , "n");
        morseMap.put("---" , "o");
        morseMap.put(".--.", "p");
        morseMap.put("--.-", "q");
        morseMap.put(".-." , "r");
        morseMap.put("..." , "s");
        morseMap.put("-"   , "t");
        morseMap.put("..-" , "u");
        morseMap.put("...-", "v");
        morseMap.put(".--" , "w");
        morseMap.put("-..-", "x");
        morseMap.put("-.--", "y");
        morseMap.put("--..", "z");
        
        StringBuilder sb = new StringBuilder();
        for (String str : letter.split(" ")) {
            if ( morseMap.containsKey(str) ) {
                sb.append(morseMap.get(str));
            }
        }
        
        return sb.toString();
    }
}