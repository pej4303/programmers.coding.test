class Solution {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder();

            char[] arr = s.toLowerCase().toCharArray();
            
            for (int i=0; i<arr.length; i++) {
                if (i == 0 || arr[i-1] == ' ') {
                    sb.append(Character.toUpperCase(arr[i]));
                } else {
                    sb.append(arr[i]);
                }
            }

            return sb.toString();
        }
    }