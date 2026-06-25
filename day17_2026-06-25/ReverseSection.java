class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer answer = new StringBuffer();
        char[] arr = my_string.substring(s, e+1).toCharArray();
        
        answer.append(my_string.substring(0, s));
        for (int i = arr.length-1; i >= 0; i--) {
            answer.append(arr[i]);
        }
        answer.append(my_string.substring(e+1, my_string.length()));
        
        
        return answer.toString();
    }
}