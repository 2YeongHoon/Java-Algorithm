public class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = String.valueOf(n);
        String[] digits = number.split("");
        
        for ( String tmp: digits){
            answer += Integer.parseInt(tmp);
        }

        return answer;
    }
}