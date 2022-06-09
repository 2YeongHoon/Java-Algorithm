import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] b = s.split("");
        Arrays.sort(b, Collections.reverseOrder());
        answer = String.join("", b);
        
        return answer;
    }
}