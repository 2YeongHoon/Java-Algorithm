import java.util.*;

class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n);
        String[] b = a.split("");
        int size = b.length;
        int[] answer = new int[size];

        for ( int i = 1; i <= size; i++ ){
            answer[i-1] = Integer.parseInt(b[size-i]);
        }
        return answer;
    }
}