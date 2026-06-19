class Solution {
    public String solution(int[] numLog) {
        StringBuffer answer = new StringBuffer("");
        
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i-1];
            switch(diff) {
                case -1 -> answer.append("s");
                case 1 -> answer.append("w");
                case -10 -> answer.append("a");
                case 10 -> answer.append("d");
            }
        }
        
        return answer.toString();
    }
}