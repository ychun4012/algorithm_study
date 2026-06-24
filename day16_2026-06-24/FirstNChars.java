class Solution {
    public String solution(String my_string, int n) {
        StringBuffer answer = new StringBuffer();
        answer.append(my_string.substring(0, n));
        return answer.toString();
    }
}