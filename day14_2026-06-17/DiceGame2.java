class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] count = new int[7];
        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;
        
        int max = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        for (int i = 1; i <= 6; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        
        switch (max) {
                case 1 -> { for (int i = 1; i <= 6; i++) {
                                if (count[i] == 1) {
                                    p = i;
                                    break;
                                }
                            }
                            answer = p; }
                case 2 -> { int kinds = 0;
                            for (int i = 1; i <= 6; i++) {
                                if (count[i] > 0) kinds++;
                            } if (kinds == 2) {
                                for (int i = 1; i <= 6; i++) {
                                if (count[i] == 2 && p == 0) p = i;
                                else if (count[i] == 2) q = i;
                            }
                            answer = (p + q) * Math.abs(p - q); 
                            } else if (kinds == 3) {
                                for (int i = 1; i <= 6; i++) {
                                if (count[i] == 1 && q == 0) q = i;
                                else if (count[i] == 1) r = i;
                            }
                            answer = q * r; 
                            }
                            }
                case 3 -> { for (int i = 1; i <= 6; i++) {
                                if (count[i] == 3) p = i;
                                if (count[i] == 1) q = i;  
                            }
                            answer = (int)Math.pow(10 * p + q, 2); }
                case 4 -> { for (int i = 1; i <= 6; i++) {
                                if (count[i] == 4) p = i;
                            }
                            answer = 1111 * p; }
        }
        
        return answer;
    }
}