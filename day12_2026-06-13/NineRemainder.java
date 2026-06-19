class Solution {
    public int solution(String number) {
        int answer = 0;
        int total = 0;
        char[] arr = number.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            total  += Character.getNumericValue(arr[i]);
        }
        
        answer = total % 9;
        
        
        return answer;
    }
}