class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int small = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < small) {
                    answer[i] = arr[j];
                    small = arr[j];
                } else if (small == Integer.MAX_VALUE) {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}