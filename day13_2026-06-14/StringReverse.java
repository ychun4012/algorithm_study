class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder string = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            String replace = new StringBuilder(string.substring(s, e + 1)).reverse().toString();
            
            string.replace(s, e + 1, replace);
        }
        
        
        return string.toString();
    }
}