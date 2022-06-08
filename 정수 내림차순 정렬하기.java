import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String tmp = Long.toString(n);
        String[] b = tmp.split("");

        Arrays.sort(b, Collections.reverseOrder());
        tmp = String.join("", b);
        answer = Long.parseLong(tmp);

        return answer;
    }
}