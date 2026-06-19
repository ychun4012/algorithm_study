class Solution {
    public String solution(String code) {
        String answer = "";
        char[] arr = code.toCharArray();
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (arr[idx] == '1') {
                    mode = 1;
                } else if (idx % 2 == 0) {
                    answer += arr[idx];
                }
            } else if (mode == 1) {
                if (arr[idx] == '1') {
                    mode = 0;
                } else if (idx % 2 != 0) {
                    answer += arr[idx];
                }
            }
        }
         if (answer.equals("")) {
                return "EMPTY";
            }
        
        return answer;
        
    }
}