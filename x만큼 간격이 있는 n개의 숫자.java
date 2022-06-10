import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long count = 0L;
        long tmp = 0L;

        for ( int i = 1; i < n + 1; i++ ){
            count = 0L;
            tmp = i;
            count += ( x * tmp );
            answer[i-1] = count;
        }
        return answer;
    }
}