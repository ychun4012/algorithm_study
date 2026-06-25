class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer answer = new StringBuffer();
        char[] arr = my_string.toCharArray();
        
        for (int i = c - 1; i < arr.length; i += m) {
            answer.append(arr[i]);
        }
        
        return answer.toString();
    }
}