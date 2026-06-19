class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < 1; j++) {
                answer += str1.charAt(count);
                count++;
            }
            answer += str2.charAt(i);
        }
        
        return answer;
    }
}