import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();
        
        for ( int i : arr ){
            if ( i % divisor == 0 ){
                arrList.add(i);
            }
        }
        Collections.sort(arrList);
        if ( arrList.size() == 0 ){
            arrList.add(-1);
        }
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}