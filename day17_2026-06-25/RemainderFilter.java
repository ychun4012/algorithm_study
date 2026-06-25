class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer answer = new StringBuffer();
        
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer.append(code.charAt(i));
            }
        }
        
        return answer.toString();
    }
}